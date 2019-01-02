package com.api.unirest.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.api.unirest.constants.IConstants;

public class PropertyReader {
	private static Properties prop = new Properties();

	private void loadAllProperties() {
		InputStream is = null;
		try {
			File file = new File(IConstants.CONFIG_FILE_PATH);
			is = new FileInputStream(file);
			prop.load(is);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void loadProperties() {
		loadAllProperties();
	}

	public static String getProperty(String propertyName) {
		return prop.getProperty(propertyName);
	}

}
