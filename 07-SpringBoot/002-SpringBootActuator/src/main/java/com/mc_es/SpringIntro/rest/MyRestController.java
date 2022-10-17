package com.mc_es.SpringIntro.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class MyRestController {

	@GetMapping(value = "/hello")
	public String sayHello() {
		return "Hello World! Time on server is: " + LocalDateTime.now();
	}

	@GetMapping(value = "/work")
	public String work() {
		return "Bu metot uygulama calisirken yazildi ve devtools sayesinde uygulamayi durdurmadan kendini resetledi";
	}
}
