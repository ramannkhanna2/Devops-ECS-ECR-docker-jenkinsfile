package com.airportapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airportapp.bo.RegionEntity;

public interface IRegionRepository extends JpaRepository<RegionEntity, Long> {
	List<RegionEntity> findCountryByName(String name);

	List<RegionEntity> findRegionByCode(String code);

	List<RegionEntity> findRegionByContinent(String continent);

	List<RegionEntity> findRegionByisoCountry(String country);

}
