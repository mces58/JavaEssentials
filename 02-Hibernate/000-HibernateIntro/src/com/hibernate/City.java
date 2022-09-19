package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Soru:
 * Neden Hibernate yerine JPA Annotation kullanıyoruz?
 * Örneğin, neden bu org.hibernate.annotations.Entity'yi kullanmıyoruz?
 * 
 * Cevap:
 * JPA standart bir özelliktir. Hibernate, JPA belirtiminin bir 
 * uygulamasıdır.
 * Hibernate, tüm JPA ek açıklamalarını uygular.
 * Hibernate ekibi, en iyi uygulama olarak JPA ek açıklamalarının 
 * kullanılmasını önerir.
 */

@Entity // bunun anlami veri tabaninda ki Cities demek
@Table(name = "Cities") // bu da cities tablosuna bagliyor
public class City {
	@Id // primary key
	@Column(name = "City_id") // bunlarda world'deki kolonlara bagliyor
	@GeneratedValue(strategy = GenerationType.IDENTITY) // id'yi otomatik artirmak icin
	private int id;

	@Column(name = "City_name")
	private String cityName;

	@Column(name = "Country_code")
	private String countryCode;

	@Column(name = "District")
	private String district;

	@Column(name = "Population")
	private int population;

	/*
	 * @Temporal(value = TemporalType.DATE)
	 * 
	 * @Column(name = "birthOfDate") private Date birthOfDate;
	 * 
	 * temporal tarih islemlerinde kullanilir DATE: sadece tarih tutar TIME: sadece
	 * zaman tutar TIMESTAMP: hem tarih hem zaman tutar
	 */
	/*
	 * @Lob
	 * 
	 * @Column(name = "about") private String about; lob ise uzun veri girilecegini
	 * belirtir
	 */
	public City() {

	}

	public City(String cityName, String countryCode, String district, int population) {
		this.cityName = cityName;
		this.countryCode = countryCode;
		this.district = district;
		this.population = population;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", cityName=" + cityName + ", countryCode=" + countryCode + ", district=" + district
				+ ", population=" + population + "]";
	}

}
