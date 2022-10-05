package com.mc_es.json;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

// Json dosyasinda alfabetik sirada yazmasini sagladik
// istersek kendi siramiza da olusturabiliriz
// @JsonPropertyOrder(value = { "active", "lastName", "firstName", "id" })
// json dosyasina active'den baslayarak sirasiyla lastName, firstName ve id yazar

@JsonPropertyOrder(alphabetic = true)
public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private boolean active;

	public Student(int id, String firstName, String lastName, boolean active) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public boolean isActive() {
		return active;
	}

	/*
		import java.io.IOException;
		import com.fasterxml.jackson.databind.ObjectMapper;
		
		public class JacksonTester {
		   public static void main(String args[]){
		      ObjectMapper mapper = new ObjectMapper();
		      try {
		         Student student = new Student("Mark", 1);
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
		   private String firstName;
		   private String lastName;
		   private boolean active;
		   
		   public Student(int id, String firstName, String lastName, boolean active) {
		      this.id = id;
		      this.firstName = firstName;
		      this.lastName = lastName;
		      this.active = active;
		   }
		   public int getId() {
			  return id;
		   }
		
		   public String getFirstName() {
			  return firstName;
		   }
		
		   public String getLastName() {
			  return lastName;
		   }
		
		   public boolean isActive() {
			  return active;
		   }
		}
		
		JsonPropertyOrder kullanmaz isek:
		{
			id: 1
			firstName:"Can"
			lastName:"Eser"
			active: true
		}
		field'lar hangi sirada ise oyle yazar
	*/
}
