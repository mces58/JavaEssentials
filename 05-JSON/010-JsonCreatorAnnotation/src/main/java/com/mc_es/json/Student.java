package com.mc_es.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
	private int id;
	private String firstName;
	private String lastName;

	// Okumak istedigimiz JSON degeri modelimizdeki anahtarlardan farkli bir anahtar
	// iceriyorsa, modelin kurucusu araciligiyla okudugumuz JSON’un dogru sekilde
	// alinmasini saglar.
	/*
	 * Okumak istedigimiz Json dosyasi:
	 * 
	 * "siraNo": 1,
	 * "adi": "Can",
	 * "soyadi": "Eser" 
	 * 
	 * adi alani bizim modelimizde firstName olarak gectigi icin okuma gerceklesmez. 
	 * Bunu duzeltmek icin: jsonCreator ve jsonProperty kullanilir
	 * */
	@JsonCreator
	public Student(@JsonProperty(value = "siraNo") int id, @JsonProperty(value = "adi") String firstName,
			@JsonProperty(value = "soyadi") String lastName) {
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
