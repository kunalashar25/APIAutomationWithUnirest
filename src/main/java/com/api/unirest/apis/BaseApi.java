package com.api.unirest.apis;

import com.api.unirest.utilities.PropertyReader;

/**
 * @author kunal.ashar
 * @description zomato api validations
 * 
 */

public class BaseApi {

	protected static final String baseUrl = "https://developers.zomato.com/api/v2.1/";

	public BaseApi() {
		PropertyReader pr = new PropertyReader();
		pr.loadProperties();
	}
}
