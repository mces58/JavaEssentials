package com.mc_es.CrudDemo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping(value = "/showLoginPage")
	public String showLoginPage() {
		return "fancy-login";
	}

	@GetMapping(value = "/access-denied")
	public String showAccessDenied() {
		return "access-denied";
	}
}
