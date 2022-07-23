package com.airportapp.webservices;

import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.airportapp.functions.TransformerFunctions;
import com.airportapp.repository.IAirportRepository;

@RestController
public class AirportRestController {
	private Logger logger = LoggerFactory.getLogger(AirportRestController.class);

	@Autowired
	private IAirportRepository airportRepo;

	@RequestMapping(path = "/airports/bytype/{type}", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody AirportsReponse findAirportsByType(@PathVariable("type") String type) {
		logger.info("Entered findAirportsByType");
		if (type == null)
			throw new IllegalArgumentException();
		return new AirportsReponse(airportRepo.findAirportsByType(type).stream()
				.map(TransformerFunctions::airportEntityToVO).collect(Collectors.toList()));
	}
}
