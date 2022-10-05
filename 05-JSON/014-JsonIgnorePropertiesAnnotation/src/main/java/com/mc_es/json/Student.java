package com.mc_es.json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
// Bu ozellik json dosyasinda olup ama bizim yazdirmak veya kullanmak istemedigimiz
// ozellikleri ignore ederek yani onemsiz hale getirerek onlari kullanmamis oluruz
public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private boolean active;
	private Address address;
	private List<String> languages;

	public Student() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", active=" + active
				+ ", address=" + address + ", languages=" + languages + "]";
	}
}
