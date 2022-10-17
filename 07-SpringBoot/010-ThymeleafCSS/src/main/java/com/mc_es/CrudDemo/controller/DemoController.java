package com.mc_es.CrudDemo.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping(value = "/hello")
	public String sayHello(Model model) {
		model.addAttribute("message", message()); // mesaji html sayfasina ekler
		model.addAttribute("date", new Date()); // zamani html sayfasina ekler
		model.addAttribute("name", name());

		return "helloworld"; // html sayfasinin adi
	}

	private String message() {
		return "Time on the server is: ";
	}

	private String name() {
		return "Mehmetcan ESER";
	}
}
