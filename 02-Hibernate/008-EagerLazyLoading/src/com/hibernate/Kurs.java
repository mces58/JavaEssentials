package com.hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Kurs")
public class Kurs {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "kurs_adi")
	private String kursAdi;

	// cascade all yapmadik cunku kursu sildigimizde egitmeni silmek istemiyoruz
	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	@JoinColumn(name = "egitmen_id") // tablodaki sutun ile eslestir
	private Egitmen egitmen;

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

	public Egitmen getEgitmen() {
		return egitmen;
	}

	public void setEgitmen(Egitmen egitmen) {
		this.egitmen = egitmen;
	}

	@Override
	public String toString() {
		return "Kurs [id=" + id + ", kursAdi=" + kursAdi + ", egitmen=" + egitmen + "]";
	}

}
