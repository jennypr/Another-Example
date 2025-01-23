package com.neotech.review02;

import com.neotech.utils.ConfigsReader;
import com.neotech.utils.Constants;

public class Test1 {

	public static void main(String[] args) {
		
		// I will store the path of configuration file in my constants
		//String filePath=System.getProperty("user.dir")+ "/configs/conf.properties";
		//System.out.println(filePath);
		

		
		//I read the file ONLY once
		ConfigsReader.readProperties(Constants.CONFIGUATION_FILEPATH);
		
		String browser=ConfigsReader.getProperty("browser");
		System.out.println(browser);
		
		
		System.out.println(ConfigsReader.getProperty("url"));
		System.out.println(ConfigsReader.getProperty("name"));
		System.out.println(ConfigsReader.getProperty("password"));
		
	}

}
