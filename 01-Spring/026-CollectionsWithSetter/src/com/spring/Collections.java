package com.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	private String name;

	private List<String> cars;

	private Map<String, String> dictionary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCars() {
		return cars;
	}

	public void setCars(List<String> cars) {
		this.cars = cars;
	}

	public Map<String, String> getDictionary() {
		return dictionary;
	}

	public void setDictionary(Map<String, String> dictionary) {
		this.dictionary = dictionary;
	}

	public void printList() {
		System.out.println("Liste: ");
		for (String car : cars) {
			System.out.println(car);
		}
	}

	public void printMap() {
		System.out.println("\nMap: ");
		Set<String> keys = dictionary.keySet();

		for (String key : keys) {
			System.out.println(key + " : " + dictionary.get(key));
		}
	}
}
