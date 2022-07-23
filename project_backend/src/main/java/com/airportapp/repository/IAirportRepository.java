package com.airportapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airportapp.bo.AirportEntity;

public interface IAirportRepository extends JpaRepository<AirportEntity, Long> {

	List<AirportEntity> findAirportsByType(String type);

	List<AirportEntity> findAirportsByAirportName(String name);

	List<AirportEntity> findAirportsByLatitude(String type);

	List<AirportEntity> findAirportsByLongitude(String type);

}
