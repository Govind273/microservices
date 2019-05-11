package com.microservices.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

	@RequestMapping("/login")
	@ResponseBody
	public String welcomeUser() {
		return "Welcome Spring Boot User";
	}
}
