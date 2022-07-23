package com.airport.services;

import java.util.List;

import com.airportsapp.vo.AirportVO;
import com.airportsapp.vo.NavAidVO;
import com.airportsapp.vo.RegionVO;

/**
 * business cases which i really going to expose as the Edge API -->
 * Participants to implement the Services using Spring Boot 
 */
public interface IAirportService {
	List<AirportVO> listAllAirports();

	List<AirportVO> findAirportsByName(String name);

	List<AirportVO> findAirportsByCountry(String country);

	List<AirportVO> findAirportsByRunways();

	List<AirportVO> listAllHeliports();

	List<AirportVO> listAirportsByContinent(String continent);

	List<RegionVO> listAllRegions();

	List<NavAidVO> listAllNavaids();

	AirportVO getRandomAirport();

	void listAllCountries();

	List<String> listAllContinents();

	void login();

	void signup();

	void help();

	List<AirportVO> airportsSorted(String key);

	void listAirportsPaginated();
}
