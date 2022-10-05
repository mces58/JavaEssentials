package com.mc_es.json;

import com.fasterxml.jackson.annotation.JsonManagedReference;

public class Course {
	private int id;
	private String courseName;

	@JsonManagedReference
	private Student student;

	public Course() {

	}

	public Course(int id, String courseName, Student student) {
		this.id = id;
		this.courseName = courseName;
		this.student = student;
	}

	public int getId() {
		return id;
	}

	public String getCourseName() {
		return courseName;
	}

	public Student getStudent() {
		return student;
	}

}
