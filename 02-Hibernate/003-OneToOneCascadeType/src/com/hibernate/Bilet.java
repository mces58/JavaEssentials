package com.hibernate;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Bilet")
public class Bilet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name = "satis_tarihi")
	private Date satisTarihi;

	@Column(name = "koltuk_no")
	private int koltukNo;

	@Column(name = "bilet_fiyati")
	private double biletFiyati;

	@OneToOne(mappedBy = "bilet", cascade = CascadeType.ALL, targetEntity = Musteri.class)
	// bileti silersek buna bagli musteri de silinsin diye all yaptik
	// targetEntity kim iliski kuruyorsak o class'i veriyoruz
	private Musteri musteri;

	public Bilet() {

	}

	public Bilet(Date satisTarihi, int koltukNo, double biletFiyati) {
		this.satisTarihi = satisTarihi;
		this.koltukNo = koltukNo;
		this.biletFiyati = biletFiyati;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getSatisTarihi() {
		return satisTarihi;
	}

	public void setSatisTarihi(Date satisTarihi) {
		this.satisTarihi = satisTarihi;
	}

	public int getKoltukNo() {
		return koltukNo;
	}

	public void setKoltukNo(int koltukNo) {
		this.koltukNo = koltukNo;
	}

	public double getBiletFiyati() {
		return biletFiyati;
	}

	public void setBiletFiyati(double biletFiyati) {
		this.biletFiyati = biletFiyati;
	}

	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}

}
