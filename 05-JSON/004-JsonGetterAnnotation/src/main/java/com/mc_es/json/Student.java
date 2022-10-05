package com.mc_es.json;

import com.fasterxml.jackson.annotation.JsonGetter;

public class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	// Bu anatasyon ile json'da key'in degerini degistirebiliyoruz
	// Normalde ozelligin adi name lakin biz ogrenci adi yaptik
	// Biz ogrenci adi degerini vermeden kullanirsak bu seferde getter'daki
	// ismi alirdi yani studentName olacakti
	@JsonGetter(value = "ogrenci adi")
	public String getStudentName() {
		return name;
	}
	/*
		import java.io.IOException; 
		import com.fasterxml.jackson.databind.ObjectMapper; 
		
		public class JacksonTester {
		   public static void main(String args[]){
		      ObjectMapper mapper = new ObjectMapper();
		      try {
		         Student student = new Student(1, "Can");
		         String jsonString = mapper 
		            .writerWithDefaultPrettyPrinter()
		            .writeValueAsString(student);
		         System.out.println(jsonString);
		      }
		      catch (IOException e) {
		         e.printStackTrace();
		      }
		   }
		}
		class Student {
		   private int id;
		   private String name;
		   
		   public Student(int id, String name){
		      this.id = id;
		      this.name = name;
		   }  
		   
		   public String getStudentName(){
		      return name;
		   } 
		   
		   public int getId(){
		      return rollNo;
		   }
		} 

	JsonGetter kullanmaz isek cikti:
	{
		id: 1
		studentName:"Can"
	}
	*/
}
