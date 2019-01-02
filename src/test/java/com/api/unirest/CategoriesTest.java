package com.api.unirest;

import org.junit.Test;

import com.api.unirest.apis.GetCategoriesApi;
import com.api.unirest.utilities.Assertions;
import com.mashape.unirest.http.HttpResponse;

public class CategoriesTest {

	@Test
	public void verifyCategoryStatusCode() {
		GetCategoriesApi		categoryApi	= new GetCategoriesApi();
		HttpResponse<String>	response	= categoryApi.getAllCategories();
		
		// to verify status code
		Assertions.verifyStatusCode(response.getStatus(), 200);
	}

	@Test
	public void verifyResponseContainsId() {
		GetCategoriesApi		categoryApi	= new GetCategoriesApi();
		HttpResponse<String>	response	= categoryApi.getAllCategories();

		// to verify string in response body
		Assertions.verifyContainsString(response.getBody(), "id");
	}
}
