package com.spring;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//xml dosyasi olmadan deger atama

@Configuration
public class AppConfig {

	// setter ile deger atama
	@Bean
	public Collections collections() {
		List<String> cars = Arrays.asList("Lamborgini", "Bugatti", "Ferrari", "Renault");

		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("table", "masa");
		dictionary.put("phone", "telefon");
		dictionary.put("computer", "bilgisayar");
		dictionary.put("glass", "bardak");

		Collections collections = new Collections();
		collections.setName("Can");
		collections.setCars(cars);
		collections.setDictionary(dictionary);

		return collections;
	}
}
