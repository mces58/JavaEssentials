package com.mc_es.json;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonValue;

public class Student {
	private int id;
	private String name;
	private String code;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@JsonGetter
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	// donen sonucu json yapiyor
	@JsonValue(value = true)
	public String getCode() {
		this.code = this.name.substring(0, 2) + " - " + this.id;
		return code;
	}

}
