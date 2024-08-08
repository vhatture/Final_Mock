package com.crm.JavaUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JavaUtility {
	public static String getInputData(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/configuration/login.properties");
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
	
		
}