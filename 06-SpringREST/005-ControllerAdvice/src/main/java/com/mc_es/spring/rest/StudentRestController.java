package com.mc_es.spring.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mc_es.spring.entitiy.Student;
import com.mc_es.spring.error.StudentNotFoundException;

@RestController
@RequestMapping(value = "/api")
public class StudentRestController {
	private List<Student> students;

	@PostConstruct
	public void load() {
		students = new ArrayList<Student>();
		students.add(new Student(0, "Can", "Eser", 21));
		students.add(new Student(1, "Emirhan", "Eser", 13));
		students.add(new Student(2, "Furkan", "Eser", 19));
	}

	@GetMapping(value = "/students")
	public List<Student> getStudents() {
		return students;
	}

	// bir onceki ornekte rest ve exception handling ayni class'ta idi. simdi ise
	// bunlari ayirdik
	@GetMapping(value = "/students/{studentid}")
	public Student getStudentByid(@PathVariable(name = "studentid") int studentid) {

		if (studentid > this.students.size() || studentid < 0) {
			throw new StudentNotFoundException("Bu id degerine sahip ogrenci yok: " + studentid);
		}

		return this.students.get(studentid);
	}

}
