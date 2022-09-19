package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Kurs")
public class Kurs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "kurs_adi")
	private String kursAdi;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH }, targetEntity = Ogrenci.class)
	@JoinTable(name = "Kurs_Ogrenci", joinColumns = @JoinColumn(name = "kurs_id"), inverseJoinColumns = @JoinColumn(name = "ogrenci_id"))
	// ilk name ile tablo adini girdik
	// joinColumns ile Kurs tablosu ile kursId'yi bagladik
	// inverseJoinColumns ile ogrenciId'yi bagladik
	// coga cok iliskilerde iki tarafta baglanir.

	private List<Ogrenci> ogrenci;

	public Kurs() {

	}

	public Kurs(String kursAdi) {
		this.kursAdi = kursAdi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKursAdi() {
		return kursAdi;
	}

	public void setKursAdi(String kursAdi) {
		this.kursAdi = kursAdi;
	}

	public List<Ogrenci> getOgrenci() {
		return ogrenci;
	}

	public void setOgrenci(List<Ogrenci> ogrenci) {
		this.ogrenci = ogrenci;
	}

	public void addOgrenci(Ogrenci ogrenci) {
		if (this.ogrenci == null) {
			this.ogrenci = new ArrayList<Ogrenci>();
		}
		this.ogrenci.add(ogrenci);
	}

	@Override
	public String toString() {
		return "Kurs [id=" + id + ", kursAdi=" + kursAdi + "]";
	}

}
