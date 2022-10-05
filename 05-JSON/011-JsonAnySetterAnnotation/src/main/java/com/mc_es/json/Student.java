package com.mc_es.json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnySetter;

public class Student {
	private Map<String, String> properties;

	public Student() {
		this.properties = new HashMap<>();
	}

	public Map<String, String> getProperties() {
		return properties;
	}

	// @JsonAnyGetter aciklamasinin yaptigi isin tersini yapar. Okunan JSON’daki
	// modelde bulunan anahatarlari dogru sekilde atadiktan sonra, kalan anahtarlari
	// ve degerleri bir Map nesnesine atar.

	@JsonAnySetter(enabled = true)
	public void add(String property, String value) {
		this.properties.put(property, value);
	}
}
