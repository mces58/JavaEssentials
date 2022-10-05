package com.mc_es;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mc_es.json.Student;

public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		student.numaraSet(1);
		student.adiSet("Can");
		student.soyAdiSet("Eser");

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
