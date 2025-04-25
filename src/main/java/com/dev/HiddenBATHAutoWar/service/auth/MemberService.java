package com.dev.HiddenBATHAutoWar.service.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.dev.HiddenBATHAutoWar.model.auth.Member;
import com.dev.HiddenBATHAutoWar.repository.auth.MemberRepository;

@Configuration
@Service
public class MemberService {

	@Autowired
	MemberRepository memberRepository;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	public Member insertMember(Member member) {
		String encodedPassword = passwordEncoder.encode(member.getPassword());
		member.setPassword(encodedPassword);
		member.setRole(member.getRole());
		return memberRepository.save(member);

	}
}
