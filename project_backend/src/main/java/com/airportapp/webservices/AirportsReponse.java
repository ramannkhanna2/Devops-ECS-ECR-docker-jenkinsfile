package com.airportapp.webservices;

import java.util.List;

import com.airportsapp.vo.AirportVO;

public class AirportsReponse {

	public AirportsReponse() {
	}

	public AirportsReponse(List<AirportVO> data) {
		this.data = data;
	}

	private List<AirportVO> data;

	public List<AirportVO> getData() {
		return data;
	}

	public void setData(List<AirportVO> data) {
		this.data = data;
	}
}
