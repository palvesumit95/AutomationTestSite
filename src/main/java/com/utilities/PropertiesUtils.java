package com.utilities;

import java.io.FileInputStream;

import java.util.Properties;

public class PropertiesUtils {

	public static	FileInputStream fis = null;
	public static Properties prop = null;

	public static String getProperty(String key) throws Exception  {
		
		
		prop = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/config.properties");
		prop.load(fis);
		return prop.getProperty(key);

	}





}
