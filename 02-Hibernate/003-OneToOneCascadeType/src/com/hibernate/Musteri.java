package com.hibernate;

import javax.persistence.CascadeType;
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

	@OneToOne(cascade = CascadeType.ALL, targetEntity = Bilet.class)
	// cascade.persist = Bu ozellik ile biz musteriyi veri tabanina kaydettigimizde
	// ayni zamanda biletide kaydeder. Boylece tekrardan bileti veri tabanina
	// kaydetmeye gerek yok <-- session.save(bilet) yapmamiza gerek yok -->

	// cascade.remove = Bu ozellik ile biz musteriyi veri tabanindan sildigimizde
	// ayni zamanda b musteriye bagli biletide veri tabanindan siler. Genelde
	// bire-bir iliskilerde kullanilir.Ornegin musteri yok ise bilette olmamalidir
	// bu ozellik ile direk bizim yerimize musteriye bagli biletide siler.
	// Tam tersinin gecerli olabilmesi icin yani bileti sildigimizde musteride
	// olmasin istiyorsak bilet class'inda da bu ozelligi yazmaliyiz

	// cascade.all = Bu ozellik hepsini iceriyor.

	// cascade.merge = Musteri uzerinde update olursa bilettede olsun
	
	// targetEntity kim ile iliski kuruyorsak o class'i veriyoruz
	@JoinColumn(name = "bilet_id")
	private Bilet bilet;

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
