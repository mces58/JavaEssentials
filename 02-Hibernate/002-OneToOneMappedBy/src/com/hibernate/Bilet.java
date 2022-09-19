package com.hibernate;

import java.util.Date;

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

	@Temporal(value = TemporalType.TIMESTAMP) // tarih ve saat bir arada
	@Column(name = "satis_tarihi")
	private Date satisTarihi;

	@Column(name = "koltuk_no")
	private int koltukNo;

	@Column(name = "bilet_fiyati")
	private double biletFiyati;

	// bizim biletten musteriye gecebilmemiz icin bilet class'inda
	// musteri diye bir degiskenimiz olmalidir ki biletten musteriye gecis yapalim
	// yine bire bir iliki oldugunu belirtmemiz gerekiyor
	// musteriyi dahil ettik getter ve setter yazdik
	// mappedBy = bilet buradaki isim ile Musteri class'indaki
	// field ayni isimde olmalidir. Yani ikisi de bilet olmalidir
	// Boylece cift yonlu okuma yapabiliriz. Buna bi-direction denir.
	@OneToOne(mappedBy = "bilet")
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
