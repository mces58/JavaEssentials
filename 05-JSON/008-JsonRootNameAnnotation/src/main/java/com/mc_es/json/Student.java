package com.mc_es.json;

import com.fasterxml.jackson.annotation.JsonRootName;

// JSON ciktisina ana anahtar vermek icin kullanilir.
@JsonRootName(value = "student")
public class Student {
	private int id;
	private String firstName;
	private String lastName;

	public Student(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
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

}
