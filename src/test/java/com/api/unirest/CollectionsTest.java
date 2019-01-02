package com.api.unirest;

import org.junit.Test;

import com.api.unirest.apis.GetCitiesApi;
import com.api.unirest.apis.GetCollectionApi;
import com.api.unirest.utilities.Assertions;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;

public class CollectionsTest {

	@Test
	public void getCollectionByCityId() {
		GetCitiesApi			cityApi			= new GetCitiesApi();
		GetCollectionApi		collectionApi	= new GetCollectionApi();
		String					cityName		= "Mumbai";
		int						cityId			= 0;

		HttpResponse<JsonNode>	cityResponse	= cityApi.getCitiesByNameAsJson(cityName);
		cityId = (Integer) cityResponse.getBody().getObject().getJSONArray("location_suggestions").getJSONObject(0)
		        .get("id");

		HttpResponse<String> collectionResponse = collectionApi.getCollectionByCity(cityId);
		Assertions.verifyStatusCode(collectionResponse.getStatus(), 200);

	}

}
