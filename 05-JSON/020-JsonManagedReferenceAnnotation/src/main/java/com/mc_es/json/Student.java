package com.mc_es.json;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class Student {
	private int id;
	private String firstName;
	private String lastName;

	// @JsonManagedReferences ve JsonBackReferences, ust alt iliskiye sahip
	// nesneleri goruntulemek icin kullanilir. @JsonManagedReferences ust nesneye
	// basvurmak icin kullanilir ve @JsonBackReferences alt nesneleri isaretlemek
	// icin kullanilir.
	@JsonBackReference
	private List<Course> courses;

	public Student() {

	}

	public Student(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// kurs ekle

	public void add(Course course) {
		if (this.courses == null) {
			this.courses = new ArrayList<Course>();
		}
		this.courses.add(course);
	}

	// getters

	public int getid() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public List<Course> getCourses() {
		return courses;
	}
}
