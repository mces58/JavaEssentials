package com.mc_es;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mc_es.json.Student;

public class Main {
	public static void main(String[] args) throws IOException {
		Student student = new Student(1, "can");

		ObjectMapper mapper = new ObjectMapper();

		// string cevir
		String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
		System.out.println(result.toString());

		// dosyaya yaz
		mapper.writerWithDefaultPrettyPrinter().writeValue(new File("jsonData/student.json"), student);
		System.out.println("Dosyaya yazildi.");
	}
}
