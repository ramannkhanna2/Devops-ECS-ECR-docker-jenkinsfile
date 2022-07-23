package com.airportapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airportapp.bo.CountryEntity;

public interface ICountryRepository extends JpaRepository<CountryEntity, Long> {
	List<CountryEntity> findCountryByName(String name);

	List<CountryEntity> findCountryByCode(String code);

	List<CountryEntity> findCountryByContinent(String continent);

}
