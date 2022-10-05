package com.mc_es;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.mc_es.json.Student;

public class Main {
	public static void main(String[] args) throws IOException {
		Student student = new Student(1, "Can", "Eser");

		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.WRAP_ROOT_VALUE); // root aktif et

		// string cevir
		String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
		System.out.println(result.toString());

		// dosyaya yaz
		mapper.writerWithDefaultPrettyPrinter().writeValue(new File("jsonData/student.json"), student);
		System.out.println("Dosyaya yazildi.");
	}
}
