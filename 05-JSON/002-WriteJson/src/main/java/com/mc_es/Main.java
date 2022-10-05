package com.mc_es;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mc_es.json.Address;
import com.mc_es.json.Student;

public class Main {
	public static void main(String[] args) {
		/* json dosyasina veri yazma */
		writeJson();
		readJson();
	}

	public static void writeJson() {
		Address address = new Address();
		address.setStreet("100 Main St");
		address.setCity("Philadelphia");
		address.setState("Pennsylvania");
		address.setZip("19103");
		address.setCountry("USA");

		ArrayList<String> languages = new ArrayList<String>();
		languages.add("Java");
		languages.add("Python");
		languages.add("C#");
		languages.add("Javascript");

		Student student = new Student();
		student.setId(1);
		student.setFirstName("Can");
		student.setLastName("ESER");
		student.setActive(false);
		student.setAddress(address);
		student.setLanguages(languages);

		ObjectMapper mapper = new ObjectMapper();
		try {
			// writerWithDefaultPrettyPrinter() yazinin formatini guzellestirir
			// student gondererek dosyaya yazar.
			mapper.writerWithDefaultPrettyPrinter().writeValue(new File("jsonData/student.json"), student);
			System.out.println("Veri dosyaya yazildi.");

			// veriyi string ifadeye cevirir
			String info = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
			System.out.println(info);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readJson() {
		ObjectMapper mapper = new ObjectMapper();

		try {
			Student student = mapper.readValue(new File("jsonData/student.json"), Student.class);
			System.out.println(student);
			System.out.println("Sifinci index: " + student.getLanguages().get(0));
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
