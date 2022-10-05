package com.mc_es.json;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

//@JsonIdentityInfo, ornegin sonsuz ozyineleme turleriyle ugrasirken 
//oldugu gibi degerleri serilestirirken/seri hale getirirken Nesne 
//Kimliginin kullanilmasi gerektigini belirtir.
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Course {
	private int id;
	private String courseName;
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
