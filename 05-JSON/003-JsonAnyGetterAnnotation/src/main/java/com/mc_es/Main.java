package com.mc_es;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mc_es.json.Student;

public class Main {
	public static void main(String[] args) throws IOException {
		Student student = new Student();
		student.add("firstName", "Can");
		student.add("lastName", "Eser");
		student.add("active", "true");
		student.add("phone", "055555555");

		ObjectMapper mapper = new ObjectMapper();

		// string cevir
		String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
		System.out.println(result.toString());

		// dosyaya yaz
		mapper.writerWithDefaultPrettyPrinter().writeValue(new File("jsonData/student.json"), student);
		System.out.println("Dosyaya yazildi.");
	}
}
