package com.mc_es;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mc_es.json.Student;

public class Main {
	public static void main(String[] args) throws IOException {
		// temel de bugunun tarihini json tipinde ekledik

		ObjectMapper mapper = new ObjectMapper();
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date dateNow = Calendar.getInstance().getTime();
		String stringDate = dateFormat.format(dateNow);
		Student student = null;
		try {
			student = new Student(1, "Can", "Eser", dateFormat.parse(stringDate));
		} catch (ParseException e) {

			e.printStackTrace();
		}

		// string cevir
		String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
		System.out.println(result.toString());

		// dosyaya yaz
		mapper.writerWithDefaultPrettyPrinter().writeValue(new File("jsonData/student.json"), student);
		System.out.println("Dosyaya yazildi.");
	}
}
