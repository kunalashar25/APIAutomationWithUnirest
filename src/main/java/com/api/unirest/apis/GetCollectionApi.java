package com.api.unirest.apis;

import java.util.Map;

import com.api.unirest.utilities.GetDefaultHeader;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class GetCollectionApi extends BaseApi {

	private static String collectionUrl = baseUrl + "collections";

	public HttpResponse<String> getCollectionByCity(int cityId) {

		Map<String, String> headerMap = GetDefaultHeader.getHeaders();

		if (cityId > 0) {
			collectionUrl = collectionUrl + "?city_id=" + cityId;
		}

		try {
			return Unirest.get(collectionUrl).headers(headerMap).asString();

		} catch (UnirestException e) {

			e.printStackTrace();
		}
		return null;
	}

}
