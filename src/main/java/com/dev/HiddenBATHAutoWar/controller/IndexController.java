package com.dev.HiddenBATHAutoWar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping({"/index", "/", ""})
	public String index() {
		
		return "front/order/nonStandardOrderProduct";
	}
	
	@GetMapping("/loginForm")
	public String loginForm() {
		
		return "front/test/loginForm";
	}
	
}
