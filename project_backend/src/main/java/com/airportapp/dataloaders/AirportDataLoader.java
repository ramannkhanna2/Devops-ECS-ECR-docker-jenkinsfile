package com.airportapp.dataloaders;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.airportapp.bo.AirportEntity;
import com.airportapp.functions.TransformerFunctions;
import com.airportapp.repository.IAirportRepository;
import com.airportsapp.vo.AirportVO;

@Component
@Qualifier("dataLoader")
/**
 * Data Loader used to Load Data from incoming Directory Depicting Timer and Scheduled Function 
 * and Streaming data Function of java 
 * @author niles
 *
 */
public class AirportDataLoader {

	/**
	 * Logger logback to use application specific loggers.....
	 */
	private static final Logger logger = LoggerFactory.getLogger(AirportDataLoader.class);
	ReentrantLock lock = new ReentrantLock();

	/** Read the properties from properties file */
	@Value("${airports.location}")
	private String fileLocation;

	@Value("${airports.poll.interval}")
	private long pollInterval;

	/** Dependency Injection */
	@Autowired
	private IAirportRepository airportRepo;

	/**
	 * @EnableScheduling (Every 10 Secs)
	 */
//	@Scheduled(fixedDelay = 10000)
	public void pollRecords() {
		if (logger.isDebugEnabled()) {
			logger.debug("in poll records");
		}
		lock.lock();
		logger.info("Entered pollRecords Locked Not allowing Others to enter");
		logger.info("Polling New Records For Airports");
		try {
			/** mordern java 11 file read **/
			Path fileToRead = Files.list(Paths.get(fileLocation)).findFirst().orElseThrow();
			if (logger.isTraceEnabled()) {
				logger.trace("File Name " + fileToRead);
			}
			if (fileToRead != null) {
				if (logger.isDebugEnabled()) {
					logger.debug("Found the file and Reading the file" + fileToRead);
				}
				/** applied the Functional Programming from java **/
				List<AirportVO> airports = Files.readString(fileToRead).lines().parallel().skip(1)
						.map(TransformerFunctions::stringToAirport).collect(Collectors.toList());
				if (logger.isDebugEnabled()) {
					logger.debug("Airports Was parsed mapped");
				}

				Files.move(fileToRead, Paths.get(fileLocation + "/../success/" + fileToRead.getFileName().toString()),
						StandardCopyOption.REPLACE_EXISTING);
				processdata(airports);
				logger.info("Total Records Parsed " + airports.size());
			} else {
				logger.info("No New Files Detected");
			}
		} catch (NoSuchElementException e) {
			logger.error("No Input Files Located..");
		} catch (Exception e) {
			logger.error("Error", e);
		}
		logger.info("Entered Exited Unlocking ...");
		lock.unlock();
	}

	/**
	 * internal private method....
	 * 
	 * @param airports ERROR --> ERROR LEVEL (Cath Block , Failure , Exits) WARNING
	 *                 --> WARNING is typically for the warning--> Using ---> You
	 *                 are not want to use in future INFO ---> Information if you
	 *                 use info then Warning and Error will printed DEBUG --> for
	 *                 more deeper level for developer under (Flow/Line by line)
	 *                 TRACE --> Values of parameters and value of statement and
	 *                 value object passed + all Debug (nosiest)
	 * 
	 */
	private void processdata(List<AirportVO> airports) {
		logger.info("Entered processdata");
		List<AirportEntity> entities = airports.stream().map(TransformerFunctions::airportVOToEntity)
				.collect(Collectors.toList());
		airportRepo.saveAll(entities);
		logger.info("Entered processdata");
	}

}
