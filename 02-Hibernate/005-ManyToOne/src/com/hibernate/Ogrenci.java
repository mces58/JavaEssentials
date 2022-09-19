package com.hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Ogrenci")
public class Ogrenci {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "ogrenci_adi")
	private String ogrenciAdi;

	@Column(name = "ogrenci_soyadi")
	private String ogrenciSoyadi;

	// ogrenci silindiginde bolum silinmesin diye CascadeType icinde remove
	// olmamalidir
	@ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH }, targetEntity = Bolum.class)
	@JoinColumn(name = "bolum_id") // kolon adini veriyoruz
	// onceki proje tek yonlu bir proje idi yani Bolum --> Ogrenci
	// ama bu proje ise cift yonlu. bire-bir iliskide iken cift yonluyu mappedBy ile
	// yapiyorken bire-cok iliskide cift yonlulugu @ManyToOne ile yapiyoruz.
	// Many burada Ogrenci olurken One ise Bolum oluyor.
	private Bolum bolum;
	// burada liste tanimlamiyoruz bolum bir tanedir yani one olan kisim

	public Ogrenci() {

	}

	public Ogrenci(String ogrenciAdi, String ogrenciSoyadi) {
		this.ogrenciAdi = ogrenciAdi;
		this.ogrenciSoyadi = ogrenciSoyadi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOgrenciAdi() {
		return ogrenciAdi;
	}

	public void setOgrenciAdi(String ogrenciAdi) {
		this.ogrenciAdi = ogrenciAdi;
	}

	public String getOgrenciSoyadi() {
		return ogrenciSoyadi;
	}

	public void setOgrenciSoyadi(String ogrenciSoyadi) {
		this.ogrenciSoyadi = ogrenciSoyadi;
	}

	public Bolum getBolum() {
		return bolum;
	}

	public void setBolum(Bolum bolum) {
		this.bolum = bolum;
	}

}
