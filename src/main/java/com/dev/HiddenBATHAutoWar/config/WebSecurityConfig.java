package com.dev.HiddenBATHAutoWar.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.session.HttpSessionEventPublisher;
import org.thymeleaf.extras.springsecurity6.dialect.SpringSecurityDialect;

import com.dev.HiddenBATHAutoWar.handler.CustomAuthenticationSuccessHandler;
import com.dev.HiddenBATHAutoWar.service.auth.PrincipalDetailsService;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
@EnableMethodSecurity
public class WebSecurityConfig {

	
	private final PrincipalDetailsService principalDetailsService;
	
	private final String[] visitorsUrls = {
			"/**", 
			"/administration/**",
			"/api/v1/**" 
	};
	
	private final String[] membersUrls = {
			"/test/member" 
	};
	
	// 관리자
	private final String[] adminsUrls = {
			"/admin/**",
			"/test/admin"
	};
	
	@Bean
	HttpSessionEventPublisher httpSessionEventPublisher() {
	    return new HttpSessionEventPublisher();
	}
	
	@Bean
	SpringSecurityDialect springSecurityDialect() {
		return new SpringSecurityDialect();
	}

	@Bean
	WebSecurityCustomizer webSecurityCustomizer() {
		return (web) -> web.ignoring().requestMatchers(PathRequest.toStaticResources().atCommonLocations());
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}
	
	@Bean
	CustomAuthenticationSuccessHandler customAuthenticationSuccessHandler() {
	    return new CustomAuthenticationSuccessHandler();
	}
	
	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		http.csrf((csrfConfig) ->  
				csrfConfig.disable())
			.headers((headerConfig) -> 
				headerConfig
					.frameOptions(frameOptionsConfig -> frameOptionsConfig.disable()))
			.authorizeHttpRequests((authorizeRequests) -> 
				authorizeRequests
					.requestMatchers(adminsUrls).hasAuthority("ROLE_ADMIN")
					.requestMatchers(membersUrls).hasAuthority("ROLE_MEMBER")
					.requestMatchers(visitorsUrls).permitAll()
					.anyRequest().permitAll())
			.formLogin((formLogin) -> 
				formLogin
					.loginPage("/loginForm")
					.usernameParameter("username")
					.passwordParameter("password")
					.loginProcessingUrl("/signinProcess")
//					.defaultSuccessUrl("/", false))
					.successHandler(customAuthenticationSuccessHandler())
					.permitAll())
			.rememberMe((remember) -> 
				remember
					.rememberMeParameter("remember")
					.userDetailsService(principalDetailsService)
					.tokenValiditySeconds(60*60*24*30)
					.alwaysRemember(false))
			.logout((logoutConfig) -> 
				logoutConfig
					.logoutUrl("/logout")
					.deleteCookies("JSESSIONID")
					.invalidateHttpSession(true)
					.logoutSuccessUrl("/index"));
			return http.build();
	}
}

