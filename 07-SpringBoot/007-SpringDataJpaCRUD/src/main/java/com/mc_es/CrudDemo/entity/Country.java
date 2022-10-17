package com.mc_es.CrudDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table(name = "Countries")
@Data // lombok getter, setter, tostring, hascode gibi fonksiyonlari icerir.
@NoArgsConstructor // default constructor
@AllArgsConstructor // tum field'lari iceren constructor
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Country_id")
	private int countryId;

	@NonNull // lombok null deger almasina izin vermez
	@Column(name = "Country_code")
	private String countryCode;

	@NonNull
	@Column(name = "Country_name")
	private String countryName;

	@NonNull
	@Column(name = "Continent")
	private String continent;

	@NonNull
	@Column(name = "Region")
	private String region;

	@Column(name = "Population")
	private int population;

	@Column(name = "Surface_area")
	private double surfaceArea;

	@NonNull
	@Column(name = "Government_form")
	private String governmentForm;

}
