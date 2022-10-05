package com.mc_es.json;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

// @JsonAutoDetect, hangi field'larin gorunur olup hangilerinin 
// gorunmediginin varsayilan anlamini gecersiz kilabilir.
// yani biz onceden field'lara getter'lar uzerinden ulasirken 
// Visibility.Any yaparak direkt field uzerinden de ulasabiliriz
// bir nevi private olmasi artik onemsiz bir hale gelmektedir.
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
public class Student {
	private int id;
	private String firstName;
	private String lastName;

	public Student() {

	}

	public Student(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
