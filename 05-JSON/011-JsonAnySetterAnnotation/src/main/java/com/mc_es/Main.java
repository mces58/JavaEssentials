package com.mc_es;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mc_es.json.Student;

public class Main {
	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();

		// JsonAnyGetter'da degerleri biz dosyaya yaziyorduk
		// Burada ise onceden varolan dosyadan degerleri cekip map ile eslestiriyoruz

		// dosyayi oku
		Student student = mapper.readValue(new File("jsonData/student.json"), Student.class);

		// string cevir
		String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
		System.out.println(result.toString());
		System.out.println("Map: " + student.getProperties());

	}
}
