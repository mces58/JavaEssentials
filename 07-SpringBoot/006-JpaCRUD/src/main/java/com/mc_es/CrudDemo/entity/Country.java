package com.mc_es.CrudDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Countries")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Country_id")
	private int countryId;

	@Column(name = "Country_code")
	private String countryCode;

	@Column(name = "Country_name")
	private String countryName;

	@Column(name = "Continent")
	private String continent;

	@Column(name = "Region")
	private String region;

	@Column(name = "Population")
	private int population;

	@Column(name = "Surface_area")
	private double surfaceArea;

	@Column(name = "Government_form")
	private String governmentForm;

	public Country() {

	}

	public Country(String countryCode, String countryName, String continent, String region, int population,
			double surfaceArea, String governmentForm) {
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.continent = continent;
		this.region = region;
		this.population = population;
		this.surfaceArea = surfaceArea;
		this.governmentForm = governmentForm;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public double getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(double surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	public String getGovernmentForm() {
		return governmentForm;
	}

	public void setGovernmentForm(String governmentForm) {
		this.governmentForm = governmentForm;
	}

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryCode=" + countryCode + ", countryName=" + countryName
				+ ", continent=" + continent + ", region=" + region + ", population=" + population + ", surfaceArea="
				+ surfaceArea + ", governmentForm=" + governmentForm + "]";
	}

}
