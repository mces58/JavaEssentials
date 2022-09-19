package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Musteri")
public class Musteri {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "musteri_adi")
	private String musteriAdi;

	@Column(name = "musteri_soyadi")
	private String musteriSoyadi;

	@OneToOne // bire-bir iliski olacagini soyluyoruz
	@JoinColumn(name = "bilet_id") // veritabanindaki musteri tablosundaki bilet_id kolonu ile eslestiriyoruz
	private Bilet bilet;
	// burada bilet turunden yaptigimiza dikkat et cunku musteri tablosuna
	// bilet tablosundan ekleyecegiz

	public Musteri() {

	}

	public Musteri(String musteriAdi, String musteriSoyadi) {
		this.musteriAdi = musteriAdi;
		this.musteriSoyadi = musteriSoyadi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMusteriAdi() {
		return musteriAdi;
	}

	public void setMusteriAdi(String musteriAdi) {
		this.musteriAdi = musteriAdi;
	}

	public String getMusteriSoyadi() {
		return musteriSoyadi;
	}

	public void setMusteriSoyadi(String musteriSoyadi) {
		this.musteriSoyadi = musteriSoyadi;
	}

	public Bilet getBilet() {
		return bilet;
	}

	public void setBilet(Bilet bilet) {
		this.bilet = bilet;
	}

}
