package com.api.unirest.utilities;

import org.junit.Assert;

public class Assertions {

	public static void verifyStatusCode(int actualStatusCode, int expectedStatusCode) {
		Assert.assertEquals("Status code not matched.", expectedStatusCode, actualStatusCode);
	}

	public static void verifyContainsString(String responseBody, String searchString) {
		Assert.assertTrue("Search String :" + searchString + " not found in resposne body",
		        responseBody.contains(searchString));
	}

}
