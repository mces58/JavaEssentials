package com.mc_es.SpringIntro.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class MyRestController {
	@Value(value = "${student.firstName}")
	private String firstName;

	@Value(value = "${student.lastName}")
	private String lastName;

	@Value(value = "${student.age}")
	private int age;

	@GetMapping(value = "/hello")
	public String sayHello() {
		return "Hello World! Time on server is: " + LocalDateTime.now();
	}

	@GetMapping(value = "/students")
	public String getStudentInfo() {
		return "student first name: " + firstName + " student last name: " + lastName + " student age: " + age;
	}
}
