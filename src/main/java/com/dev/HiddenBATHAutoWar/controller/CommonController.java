package com.dev.HiddenBATHAutoWar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {

	@GetMapping("/taskList")
	public String taskList() {
		
		return "front/common/taskList";
	}
}
