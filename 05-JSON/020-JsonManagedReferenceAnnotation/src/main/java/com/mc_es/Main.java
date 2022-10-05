package com.mc_es;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mc_es.json.Course;
import com.mc_es.json.Student;

public class Main {
	public static void main(String[] args) {

		Student student = new Student(1, "Can", "Eser");
		Course course = new Course(10, "Java", student);
		Course course2 = new Course(20, "C#", student);

		student.add(course);
		student.add(course2);

		ObjectMapper mapper = new ObjectMapper();
		try {
			// veriyi dosyaya yaz
			mapper.writerWithDefaultPrettyPrinter().writeValue(new File("jsonData/student.json"), course);
			System.out.println("Veri dosyaya yazildi");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
