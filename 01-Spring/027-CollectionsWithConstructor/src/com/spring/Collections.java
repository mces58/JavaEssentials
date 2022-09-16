package com.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {

	private String name;

	private List<String> cars;

	private Map<String, String> dictionary;

	public Collections(String name, List<String> cars, Map<String, String> dictionary) {
		this.name = name;
		this.cars = cars;
		this.dictionary = dictionary;
	}

	public String getName() {
		return name;
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
