package com.mc_es;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mc_es.json.Address;
import com.mc_es.json.Student;

public class Main {
	public static void main(String[] args) {
		Address address = new Address();
		address.setStreet("Kizilirmak");
		address.setCity("Sivas");
		address.setState("Zara");
		address.setZip("19103");
		address.setCountry("Turkey");

		List<String> languages = new ArrayList<String>();
		languages.add("Java");
		languages.add("C && C++");
		languages.add("Python");
		languages.add("Javascript");

		Student student = new Student();
		student.setId(15);
		student.setFirstName("Can");
		student.setLastName("Eser");
		student.setActive(true);
		student.setAddress(address);
		student.setLanguages(languages);

		ObjectMapper mapper = new ObjectMapper();
		try {
			// veriyi dosyaya yaz
			mapper.writerWithDefaultPrettyPrinter().writeValue(new File("jsonData/student.json"), student);
			System.out.println("Veri dosyaya yazildi");

			// dosyayi oku
			Student temp = mapper.readValue(new File("jsonData/student.json"), Student.class);
			String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(temp);
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
