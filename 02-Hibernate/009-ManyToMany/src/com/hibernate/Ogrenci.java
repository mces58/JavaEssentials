package com.hibernate;

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
@Table(name = "Ogrenci")
public class Ogrenci {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "ogrenci_adi")
	private String ad;

	@Column(name = "ogrenci_soyadi")
	private String soyad;

	@Column(name = "ogrenci_emaili")
	private String email;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH }, targetEntity = Kurs.class)
	@JoinTable(name = "Kurs_Ogrenci", joinColumns = @JoinColumn(name = "ogrenci_id"), inverseJoinColumns = @JoinColumn(name = "kurs_id"))
	// kurs class'indakinin tersini yaptik
	private List<Kurs> kurs;

	public Ogrenci() {

	}

	public Ogrenci(String ad, String soyad, String email) {
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

	public List<Kurs> getKurs() {
		return kurs;
	}

	public void setKurs(List<Kurs> kurs) {
		this.kurs = kurs;
	}

	@Override
	public String toString() {
		return "Ogrenci [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", email=" + email + ", kurs=" + kurs + "]";
	}

}
