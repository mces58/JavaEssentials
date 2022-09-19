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
	// cascade all yaparak main'de session.save(ogrenci) yapmaya gerek yok
	// cunku bolumu eklerken ogrenciyide ekliyoruz bunu da CascadeType.ALL yapiyor

	@JoinColumn(name = "bolum_id")
	// veri tabanindaki kolon ile eslestirmek icin joinColumn kullandik
	// name ozelligine de veri tabanindaki kolonun ismini verdik
	private List<Ogrenci> ogrenci;
	// Neden bir liste tanimladik?
	// Cunku bir bolumun birden fazla ogrencisi olur. Tum ogrencileri tutmak icin

	// Neden @OneToMany anatasyonunu bu class'ta tanimladik?
	// Cunku bir bolumde birden fazla ogrenci olur.
	// Bolum burada ki One es gelmektedir.
	// Ogrenci ise Many ile eslesmekledir.
	// Ayrica bu anastasyonu Ogrenci class'inda tanimlamaya calissaydin
	// @JoinColumn'da hata alirdin. Cunku biz @JoinColumn'da class'a kolon veriyoruz
	// Sen Ogrenci class'inda yapsaydin bunu bolum_id zaten Ogrenci tablosunda
	// var olan bir kolon bunu Ogrenci class'inda tekrar ona vermeye calismis
	// olurdun. Bunun yerine Bolum class'inda tanimlayarak bolum_id ile bu class'i
	// eslestirmis olduk.

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
