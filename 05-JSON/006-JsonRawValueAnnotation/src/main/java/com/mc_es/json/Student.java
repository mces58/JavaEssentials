package com.mc_es.json;

import com.fasterxml.jackson.annotation.JsonRawValue;

public class Student {
	private int id;
	private String name;

	// Verilen String değeri JSON olarak kullanmak için kullanılır.
	// Address artik json verisi olmustur ona main'de deger atanabilir
	@JsonRawValue(value = true)
	private String address;

	public Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	/*
		import java.io.IOException; 
		import com.fasterxml.jackson.databind.ObjectMapper; 
		
		public class JacksonTester {
		   public static void main(String args[]){
		      ObjectMapper mapper = new ObjectMapper();
		      try {
		         Student student = new Student("Mark", 1, "{\"attr\":false}");    
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
		  private String address;  
		  
		  public Student(int id, String name, String address){
		     this.id = id;
		     this.name = name; 
		     this.address = address; 
		  }  
		  public int getId() {
			 return id;
		  }
		
		  public String getName() {
			 return name;
		  }
		
		  public String getAddress() {
			 return address;
		  } 
		
	    }
		
		JsonRawValue olmaz ise cikti:
		
		{
			id: 1
			name:"Can"
			address:"{\"city\": \"sivas\", \"country\": \"Turkiye\"}"
		}
		
		main'de girdigimiz degerleri string olarak direkt isler
	 */
}
