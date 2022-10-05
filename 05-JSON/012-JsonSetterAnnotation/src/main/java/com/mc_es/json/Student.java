package com.mc_es.json;

import com.fasterxml.jackson.annotation.JsonSetter;

public class Student {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	// @JsonSetter, yontemi bir ayarlayici yontemi olarak isaretleyen
	// @JsonProperty'ye bir alternatiftir.

	// Bu, bazi JSON verilerini okumamiz gerektiginde inanilmaz derecede faydalidir,
	// ancak hedef varlik sinifi bu verilerle tam olarak eslesmez ve bu nedenle
	// sureci uygun hale getirmek icin ayarlamamiz gerekir.
	@JsonSetter(value = "name")
	public void setTheName(String name) {
		this.name = name;
	}

}
