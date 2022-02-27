package com.selenium.utils;

import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {

	private final Properties prop;
	private static ConfigLoader config;
	private ConfigLoader() throws IOException {
		prop=PropertyUtils.propertyStarter("src\\test\\resources\\config.properties");
	}
	
	
	public ConfigLoader getInstance() throws IOException {
		if(config==null) {
			config=new ConfigLoader();
		}
		return config;
	}
	public String getbaseUrl() {
		String properties=prop.getProperty("baseUrl");
	
			return properties;
		
	}
	
}
