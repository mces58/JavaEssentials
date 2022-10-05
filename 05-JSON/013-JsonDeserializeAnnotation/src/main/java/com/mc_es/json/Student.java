package com.mc_es.json;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class Student {
	private String firstName;
	private String lastName;

	// dosyadan date okuyup onu datetime turune cevirme
	@JsonDeserialize(using = CustomDateDeserializer.class)
	private Date dateOfBirth;

	public Student() {

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
