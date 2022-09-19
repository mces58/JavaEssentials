package com.hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Telefon")
public class Telefon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "telefon_no")
	private String telefonNo;

	@Column(name = "telefon_turu")
	private String telefonTuru;

	@ManyToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH }, targetEntity = Kullanici.class)
	// telefon silince kullanici silinmemelidir. dolayisiya remove olmamalidir.
	@JoinTable(name = "Kullanici_Telefon", joinColumns = @JoinColumn(name = "telefon_id"), inverseJoinColumns = @JoinColumn(name = "Kullanici_id"))
	private Kullanici kullanici;
	// manyToOne kullanarak cift yonlu hale getiriyoruz

	public Telefon() {

	}

	public Telefon(String telefonNo, String telefonTuru) {
		this.telefonNo = telefonNo;
		this.telefonTuru = telefonTuru;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTelefonNo() {
		return telefonNo;
	}

	public void setTelefonNo(String telefonNo) {
		this.telefonNo = telefonNo;
	}

	public String getTelefonTuru() {
		return telefonTuru;
	}

	public void setTelefonTuru(String telefonTuru) {
		this.telefonTuru = telefonTuru;
	}

	public Kullanici getKullanici() {
		return kullanici;
	}

	public void setKullanici(Kullanici kullanici) {
		this.kullanici = kullanici;
	}

	// burada kullanici bilgilerini verme zaten Kullanici sinifindaki
	// toString fonksiyonunda verdik o bilgileri
	@Override
	public String toString() {
		return "Telefon [id=" + id + ", telefonNo=" + telefonNo + ", telefonTuru=" + telefonTuru + "]";
	}

}
