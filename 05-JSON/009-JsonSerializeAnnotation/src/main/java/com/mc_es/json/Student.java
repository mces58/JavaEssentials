package com.mc_es.json;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonRootName(value = "student")
public class Student {
	private int id;
	private String firstName;
	private String lastName;

	// Tarihi json tipine cevirme
	@JsonSerialize(using = CustomDateSerializer.class)
	private Date dateOfBirth;

	public Student(int id, String firstName, String lastName, Date dateOfBirth) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

}
