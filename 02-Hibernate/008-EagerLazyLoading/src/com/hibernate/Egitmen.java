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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Egitmen")
public class Egitmen {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "egitmen_adi")
	private String ad;

	@Column(name = "egitmen_soyadi")
	private String soyad;

	@Column(name = "email")
	private String email;

	@OneToMany(mappedBy = "egitmen", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH }, fetch = FetchType.LAZY)
	private List<Kurs> kurslar;

	public Egitmen() {

	}

	public Egitmen(String ad, String soyad, String email) {
		this.ad = ad;
		this.soyad = soyad;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Kurs> getKurslar() {
		return kurslar;
	}

	public void setKurslar(List<Kurs> kurslar) {
		this.kurslar = kurslar;
	}

	public void addKurs(Kurs kurs) {
		if (this.kurslar == null) {
			this.kurslar = new ArrayList<Kurs>();
		}
		this.kurslar.add(kurs);
	}

	@Override
	public String toString() {
		return "Egitmen [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", email=" + email + ", kurslar=" + kurslar
				+ "]";
	}
}
