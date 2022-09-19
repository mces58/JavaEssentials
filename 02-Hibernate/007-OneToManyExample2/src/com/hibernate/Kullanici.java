package com.hibernate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Kullanici")
public class Kullanici {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "kullanici_adi")
	private String kullaniciAdi;

	@Column(name = "kullanici_soyadi")
	private String kullaniciSoyadi;

	@Temporal(value = TemporalType.DATE)
	@Column(name = "uyelik_tarihi")
	private Date uyelikTarihi;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "kullanici", targetEntity = Telefon.class)
	// mappedBy'in degerine Telefon class'indaki field adi verilir
	// mappedBy ile iliskinin asil sahibini Telefon class'i yaptik
	private List<Telefon> telefon;

	public Kullanici() {

	}

	public Kullanici(String kullaniciAdi, String kullaniciSoyadi, Date uyelikTarihi) {
		this.kullaniciAdi = kullaniciAdi;
		this.kullaniciSoyadi = kullaniciSoyadi;
		this.uyelikTarihi = uyelikTarihi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}

	public String getKullaniciSoyadi() {
		return kullaniciSoyadi;
	}

	public void setKullaniciSoyadi(String kullaniciSoyadi) {
		this.kullaniciSoyadi = kullaniciSoyadi;
	}

	public Date getUyelikTarihi() {
		return uyelikTarihi;
	}

	public void setUyelikTarihi(Date uyelikTarihi) {
		this.uyelikTarihi = uyelikTarihi;
	}

	public List<Telefon> getTelefon() {
		return telefon;
	}

	public void setTelefon(List<Telefon> telefon) {
		this.telefon = telefon;
	}

	public void addTelefon(Telefon telefon) {
		if (this.telefon == null) {
			this.telefon = new ArrayList<Telefon>();
		}
		this.telefon.add(telefon);
	}

	@Override
	public String toString() {
		return "Kullanici [id=" + id + ", kullaniciAdi=" + kullaniciAdi + ", kullaniciSoyadi=" + kullaniciSoyadi
				+ ", uyelikTarihi=" + uyelikTarihi + ", telefon=" + telefon + "]";
	}

}
