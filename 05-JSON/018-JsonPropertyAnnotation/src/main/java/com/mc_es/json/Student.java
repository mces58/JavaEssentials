package com.mc_es.json;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
	private int id;
	private String firstName;
	private String lastName;

	public Student() {

	}

	// JSON'da ozellik adini belirtmek icin @JsonProperty ekleyebiliriz.
	// Standart olmayan getter ve setter'larla ugrasirken ozellik adini
	// metotla eslestirmek icin kullanilir.
	// asagidaki metotlar getter/setter metotlari degildir ama onlarin
	// gorevlerini yapmaktadir. Metotlari field'larla eslestirmek icin
	// @JsonProperty kullanilir.
	@JsonProperty(value = "id")
	public int numaraGet() {
		return id;
	}

	@JsonProperty(value = "id")
	public void numaraSet(int id) {
		this.id = id;
	}

	@JsonProperty(value = "firstName")
	public String adiGet() {
		return firstName;
	}

	@JsonProperty(value = "firstName")
	public void adiSet(String firstName) {
		this.firstName = firstName;
	}

	@JsonProperty(value = "lastName")
	public String soyadiGet() {
		return lastName;
	}

	@JsonProperty(value = "lastName")
	public void soyAdiSet(String lastName) {
		this.lastName = lastName;
	}

}
