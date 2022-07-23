package com.airportapp.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class CountryEntity {

	@Id
	private Long id;

	@Column(name = "code")
	private String code;
	@Column(name = "name")
	private String name;
	@Column(name = "continent")
	private String continent;

	public Long getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public String getContinent() {
		return continent;
	}

	public String getName() {
		return name;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}
