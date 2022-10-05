package com.mc_es;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mc_es.json.Student;

public class Main {
	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();

		// json dosyasini okuma
		Student student = mapper.readValue(new File("jsonData/student.json"), Student.class);
		System.out.println(student.getDateOfBirth());
	}
}
