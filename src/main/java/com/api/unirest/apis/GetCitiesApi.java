package com.api.unirest.apis;

import java.util.Map;

import com.api.unirest.utilities.GetDefaultHeader;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class GetCitiesApi extends BaseApi {

	private static String citiesUrl = baseUrl + "cities";

	public HttpResponse<String> getCitiesByName(String cityName) {

		Map<String, String> headerMap = GetDefaultHeader.getHeaders();

		if (cityName != null) {

			citiesUrl = citiesUrl + "?q=" + cityName;
		}

		try {
			return Unirest.get(citiesUrl).headers(headerMap).asString();

		} catch (UnirestException e) {
			e.printStackTrace();

		}
		return null;
	}

	public HttpResponse<JsonNode> getCitiesByNameAsJson(String cityName) {

		Map<String, String> headerMap = GetDefaultHeader.getHeaders();

		if (cityName != null) {

			citiesUrl = citiesUrl + "?q=" + cityName;
		}

		try {
			return Unirest.get(citiesUrl).headers(headerMap).asJson();

		} catch (UnirestException e) {
			e.printStackTrace();

		}
		return null;
	}

}
