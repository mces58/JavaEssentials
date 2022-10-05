package com.mc_es.json;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

public class Student {
	private Map<String, String> properties;

	public Student() {
		this.properties = new HashMap<>();
	}

	// Java’da bulunan Map veri tipini JSON’a donusturmek icin kullanilir.
	@JsonAnyGetter
	public Map<String, String> getProperties() {
		return properties;
	}

	public void add(String property, String value) {
		this.properties.put(property, value);
	}

	/*
		import java.io.IOException; 
		import java.util.HashMap; 
		import java.util.Map; 
		import com.fasterxml.jackson.databind.ObjectMapper; 
		
		public class JacksonTester { 
		   public static void main(String args[]){
		      ObjectMapper mapper = new ObjectMapper(); 
		      try{
		         Student student = new Student(); 
		         student.add("firstName", "Can"); 
		         student.add("lastName", "Eser"); 
		         student.add("phone", "055555555");
		         student.add("active", true);
		         
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
		   private Map<String, String> properties; 
		   
		   public Student(){ 
		      properties = new HashMap<>(); 
		   } 
		   
		   public Map<String, String> getProperties(){ 
		      return properties; 
		   } 
		   
		   public void add(String property, String value){ 
		      properties.put(property, value); 
		   } 
		}
		
		JsonAnyGetter kullanmaz isek cikti:
		{
			properties: {
				firstName:"Can"
				lastName:"Eser"
				phone:"055555555"
				active:"true"
			}
		}
	 */
}
