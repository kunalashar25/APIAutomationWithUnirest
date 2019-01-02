package com.api.unirest.utilities;

import java.util.HashMap;
import java.util.Map;

import com.api.unirest.constants.IConstants;

public class GetDefaultHeader {

	public static Map<String, String> getHeaders() {
		Map<String, String> headerMap = new HashMap<String, String>();
		headerMap.put(IConstants.HEADER_KEY_ACCEPT, IConstants.HEADER_VALUE_APPLICATION_JSON);
		headerMap.put(IConstants.HEADER_KEY_USER_KEY, PropertyReader.getProperty(IConstants.PROPERTY_USER_KEY));
		return headerMap;
	}

}
