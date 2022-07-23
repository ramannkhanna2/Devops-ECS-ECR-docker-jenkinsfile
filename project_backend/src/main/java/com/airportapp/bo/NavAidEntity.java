package com.airportapp.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "navaids")
public class NavAidEntity {

	@Id
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "latitude")
	private double latitude;
	@Column(name = "longitude")
	private double longitude;

	public String getName() {
		return name;
	}

	public Long getId() {
		return id;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
}
