package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Bolum")
public class Bolum {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "bolum_adi")
	private String bolumAdi;

	@OneToMany(cascade = CascadeType.ALL, targetEntity = Ogrenci.class)
	@JoinColumn(name = "bolum_id")
	private List<Ogrenci> ogrenci;

	public Bolum() {

	}

	public Bolum(String bolumAdi) {
		this.bolumAdi = bolumAdi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBolumAdi() {
		return bolumAdi;
	}

	public void setBolumAdi(String bolumAdi) {
		this.bolumAdi = bolumAdi;
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
}
