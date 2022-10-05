package com.mc_es.json;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

// JSON verisinde hangi tur verilerin bulunacagini belirtmek icin kullanilir.
// address anahtari main'de null degere sahip oldugu icin dosyada gozukmeyecek. 
// Asagida sadece NON_NULL yani null olmayan degerlerin gozukmesini istedik.
// Ayrica main'de lastName degerini empty gonderdik bunun da dosya da gozukmesini
// istemiyorsak value = Include.NON_EMPTY kullanarak gozukmesini engelleyebiliriz.
// Include.NON_EMPTY bu ozellik hem null degerleri hem de empty degerleri gostermez.
// value = Include.ALWAYS yaparakta her seyin gozukmesine izin verebiliriz
@JsonInclude(value = Include.ALWAYS)
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
}
