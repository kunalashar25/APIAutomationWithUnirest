package com.api.unirest.apis;

import java.util.Map;

import com.api.unirest.utilities.GetDefaultHeader;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class GetCategoriesApi extends BaseApi {

	private static final String categoriesUrl = baseUrl + "categories";

	public HttpResponse<String> getAllCategories() {

		Map<String, String> headerMap = GetDefaultHeader.getHeaders();

		try {
			return Unirest.get(categoriesUrl).headers(headerMap).asString();

		} catch (UnirestException e) {
			e.printStackTrace();

		}
		return null;
	}
}
