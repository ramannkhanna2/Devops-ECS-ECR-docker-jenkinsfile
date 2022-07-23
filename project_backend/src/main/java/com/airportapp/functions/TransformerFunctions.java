package com.airportapp.functions;

import com.airportapp.bo.AirportEntity;
import com.airportsapp.vo.AirportVO;
import com.airportsapp.vo.CountryVO;
import com.airportsapp.vo.NavAidVO;
import com.airportsapp.vo.RegionVO;

/**
 * @author Nilesh Devdas
 */
public class TransformerFunctions {

	/**
	 * Private method to restrict object invocation....
	 */
	private TransformerFunctions() {
	}

	/**
	 * @param airport
	 * @return
	 */
	public static AirportVO stringToAirport(String airport) {
		if (airport == null)
			throw new IllegalArgumentException();
		var datas = airport.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
		var airportObject = new AirportVO();
		if (datas != null && datas.length > 0) {
			airportObject.setId(Long.parseLong(datas[0].replace("\"", "")));
			airportObject.setIdent(datas[1].replace("\"", ""));
			airportObject.setType(datas[2].replace("\"", ""));
			airportObject.setName(datas[3].replace("\"", ""));
			airportObject.setLatitude(Double.parseDouble(datas[4].replace("\"", "")));
			airportObject.setLongitude(Double.parseDouble(datas[5].replace("\"", "")));
			airportObject.setCountryName(datas[10].replace("\"", ""));
			airportObject.setRegionName(datas[12].replace("\"", ""));
			airportObject.setMunicipality(datas[13].replace("\"", ""));
		}
		return airportObject;
	}

	/**
	 * @param country
	 * @return
	 */
	public static CountryVO stringToCountry(String country) {
		if (country == null)
			throw new IllegalArgumentException();
		String[] datas = country.split(",");
		var countryObject = new CountryVO();
		if (datas != null && datas.length > 0) {
			countryObject.setId(Long.parseLong(datas[0].replace("\"", "")));
			countryObject.setCode(datas[1].replace("\"", ""));
			countryObject.setName(datas[2].replace("\"", ""));
			countryObject.setContinent(datas[3].replace("\"", ""));
		}
		return countryObject;
	}

	/**
	 * @param region
	 * @return
	 */
	public static RegionVO stringToRegion(String region) {
		if (region == null)
			throw new IllegalArgumentException();
		String[] datas = region.split(",");
		var regionObject = new RegionVO();
		if (datas != null && datas.length > 0) {
			regionObject.setId(Long.parseLong(datas[0].replace("\"", "")));
			regionObject.setCode(datas[1].replace("\"", ""));
			regionObject.setName(datas[3].replace("\"", ""));
			regionObject.setContinent(datas[4].replace("\"", ""));
		}
		return regionObject;
	}

	/**
	 * @param navaid
	 * @return
	 */
	public static NavAidVO stringToNavaid(String navaid) {
		if (navaid == null)
			throw new IllegalArgumentException();
		String[] datas = navaid.split(",");
		var navaidObject = new NavAidVO();
		if (datas != null && datas.length > 0) {
			navaidObject.setId(Long.parseLong(datas[0].replace("\"", "")));
			navaidObject.setName(datas[3].replace("\"", ""));
			navaidObject.setLatitude(Double.parseDouble(datas[6]));
			navaidObject.setLongitude(Double.parseDouble(datas[7]));
		}
		return navaidObject;
	}

	public static AirportEntity airportVOToEntity(AirportVO vo) {
		if (vo == null)
			throw new IllegalArgumentException();
		AirportEntity entity = new AirportEntity();
		entity.setAirportName(vo.getName());
		entity.setCountryName(vo.getCountryName());
		entity.setLatitude(vo.getLatitude());
		entity.setLongitude(vo.getLongitude());
		entity.setMunicipality(vo.getMunicipality());
		entity.setRegionName(vo.getRegionName());
		entity.setType(vo.getType());
		return entity;
	}

	public static AirportVO airportEntityToVO(AirportEntity entity) {
		if (entity == null)
			throw new IllegalArgumentException();
		AirportVO vo = new AirportVO();
		vo.setName(entity.getAirportName());
		vo.setCountryName(entity.getCountryName());
		vo.setLatitude(entity.getLatitude());
		vo.setLongitude(entity.getLongitude());
		vo.setMunicipality(entity.getMunicipality());
		vo.setRegionName(entity.getRegionName());
		vo.setType(entity.getType());
		return vo;
	}

}
