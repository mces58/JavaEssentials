package com.mc_es;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mc_es.json.Address;
import com.mc_es.json.Student;

public class Main {
	public static void main(String[] args) {
		/* ic ice json verilerini okuma */

		ObjectMapper mapper = new ObjectMapper();
		try {
			Student student = mapper.readValue(new File("jsonData/sample-full.json"), Student.class);
			System.out.println(student);

			Address address = student.getAddress();
			System.out.println(address);

			for (String language : student.getLanguages()) {
				System.out.println(language);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
