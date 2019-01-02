package com.api.unirest.apis;

import java.util.HashMap;
import java.util.Map;

import com.api.unirest.constants.IConstants;
import com.api.unirest.utilities.PropertyReader;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class GetCategoriesApi extends BaseApi {

	private static final String categoriesUrl = baseUrl + "categories";

	public static HttpResponse<String> getAllCategories() {

		Map<String, String> headerMap = new HashMap<String, String>();
		headerMap.put(IConstants.HEADER_KEY_ACCEPT, IConstants.HEADER_VALUE_APPLICATION_JSON);
		headerMap.put(IConstants.HEADER_KEY_USER_KEY, PropertyReader.getProperty(IConstants.PROPERTY_USER_KEY));

		try {
			return Unirest.get(categoriesUrl).headers(headerMap).asString();

		} catch (UnirestException e) {
			e.printStackTrace();

		}
		return null;
	}	
}
