package com.aedron.countryservice.dto;

import com.aedron.countryservice.models.Country;
import com.aedron.countryservice.models.CountryInformation;
import com.aedron.countryservice.models.CountryNameAndCode;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
public class CountryRESTAccess {
	private static List<Country> countries;

	private static final ObjectMapper objectMapper = new ObjectMapper();

	/**
	 * Gets the list of countries from https://restcountries.com/v3.1/all API and formats
	 * it to only involve the country names and codes.
	 * @return a list of CountryNameAndCode
	 * @throws IOException when something fails in the REST query
	 */
	public static void getCountries() throws IOException {
//		TODO: The initial load time on the GET request to /countries is quite slow. Looping over the JSON twice here should not be necessary.
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		URL url = new URL("https://restcountries.com/v3.1/all");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.connect();
		int responsecode = conn.getResponseCode();

		if (responsecode != 200) {
			throw new RuntimeException("HttpResponseCode: " + responsecode);
		} else {

			StringBuilder inline = new StringBuilder();
			Scanner scanner = new Scanner(url.openStream());

			while (scanner.hasNext()) {
				inline.append(scanner.nextLine());
			}
			scanner.close();
			countries = objectMapper.readValue(inline.toString(), new TypeReference<>() {
			});
		}
	}

	/**
	 * Populates the list of CountryNameAndCode with all country names and codes for the
	 * get request
	 * @return the list of CountryNameAndCode for all existing countries
	 */
	public static List<CountryNameAndCode> getCountryNamesAndCodes() {
		List<CountryNameAndCode> countryNameAndCodeList;
		countryNameAndCodeList = new ArrayList<>();
		for (Country country : countries) {
			countryNameAndCodeList.add(new CountryNameAndCode(country.getName().getCommon(), country.getCca2()));
		}
		return countryNameAndCodeList;
	}


	/**
	 * Populates the countryInformation object with the relevant country specific information
	 * for the get request
	 * @param countryName the country of which the information is queried
	 * @return the CountryInformation object that entails the information
	 */
	public static CountryInformation getCountryInformation(String countryName) throws IOException {
		// TODO: Make this handle countries with multiple capitals instead of only selecting the "first" one.
		if (countries == null) {
			getCountries();
		}
		CountryInformation countryInformation = null;
		for (Country country : countries) {
			if (Objects.equals(country.getName().getCommon().toLowerCase(), countryName.toLowerCase())) {
				countryInformation = new CountryInformation(
						country.getName().getCommon(),
						country.getCca2(),
						country.getCapital().get(0),
						country.getPopulation(),
						country.getFlags().getPng());
			}
		}
		return countryInformation;
	}
}
