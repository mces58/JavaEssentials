package com.mc_es;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mc_es.json.Student;

public class Main {
	public static void main(String[] args) {

		Date date = Calendar.getInstance().getTime();

		Student student = new Student(1, "Can", "Eser", date);

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
