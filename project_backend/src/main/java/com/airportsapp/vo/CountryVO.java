package com.airportsapp.vo;

public class CountryVO {
	private Long id;
	private String code;
	private String name;
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
