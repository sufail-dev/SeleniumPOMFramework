package com.selenium.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {

	@SuppressWarnings("resource")
	public static Properties propertyStarter(String filepath) throws IOException {
		Properties prop=new Properties();
		BufferedReader reader;
		reader=new BufferedReader(new FileReader(filepath));
		prop.load(reader);
		reader.close();
		return prop;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
