package com.api.unirest;

import org.junit.Test;

import com.api.unirest.apis.GetCitiesApi;
import com.api.unirest.utilities.Assertions;
import com.mashape.unirest.http.HttpResponse;

public class CitiesTest {

	@Test
	public void getMumbaiCityData() {
		GetCitiesApi			citiesApi	= new GetCitiesApi();
		String					cityName	= "Mumbai";
		HttpResponse<String>	response	= citiesApi.getCitiesByName(cityName);

		// to verify if response contains Mumbai
		Assertions.verifyContainsString(response.getBody(), cityName);
	}

}
