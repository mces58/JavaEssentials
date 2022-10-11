package com.mc_es.spring.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// jsp dosyasi olusturuldu
@RestController
@RequestMapping("/test")
public class MyRestController {

	// @GetMapping bir metot seviyesinde haritalandirma yapar
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World";
	}
}
