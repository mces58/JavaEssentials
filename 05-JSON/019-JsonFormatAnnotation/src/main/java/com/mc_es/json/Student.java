package com.mc_es.json;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

public class Student {
	private int id;
	private String firstName;
	private String lastName;

	// @JsonFormat ek aciklamasi, Tarih/Saat degerlerini formatlarken bir bicim
	// belirtir.
	@JsonFormat(shape = Shape.STRING, pattern = "dd-MM-yyyy")
	private Date birthDate;

	public Student() {

	}

	public Student(int id, String firstName, String lastName, Date birthDate) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}

	public int getid() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

}
