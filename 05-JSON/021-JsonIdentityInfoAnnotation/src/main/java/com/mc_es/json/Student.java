package com.mc_es.json;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

// @JsonIdentityInfo, ornegin sonsuz ozyineleme turleriyle ugrasirken 
// oldugu gibi degerleri serilestirirken/seri hale getirirken Nesne 
// Kimliginin kullanilmasi gerektigini belirtir.
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Student {
	private int id;
	private String firstName;
	private String lastName;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", courses=" + courses
				+ "]";
	}

}
