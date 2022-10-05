package com.mc_es;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mc_es.json.Student;

public class Main {
	public static void main(String[] args) {
		/* json veri okuma islemi */

		ObjectMapper mapper = new ObjectMapper();
		try {
			Student student = mapper.readValue(new File("jsonData/sample-lite.json"), Student.class);
			System.out.println(student);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
