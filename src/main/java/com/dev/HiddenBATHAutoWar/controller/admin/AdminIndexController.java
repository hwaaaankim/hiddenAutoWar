package com.dev.HiddenBATHAutoWar.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminIndexController {

	
	@GetMapping("/administration")
	public String index() {
		
		return "administration/index";
	}
}
