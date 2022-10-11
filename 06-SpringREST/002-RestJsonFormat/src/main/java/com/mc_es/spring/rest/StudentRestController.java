package com.mc_es.spring.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mc_es.spring.entitiy.Student;

@RestController
@RequestMapping(value = "/api")
public class StudentRestController {

	@GetMapping(value = "/students")
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "Can", "Eser", 21));
		students.add(new Student(2, "Emirhan", "Eser", 13));
		students.add(new Student(3, "Furkan", "Eser", 19));

		// biz ogrencileri normal bir sekilde olustursak bile
		// arka planda verileri alirken jackson sayesinde json formatinda alacagiz
		return students;
	}

}
