package com.neotech.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	/**
	 * This method will initialize the browser
	 */
	public static void setUp() 
	{
		ConfigsReader.readProperties(Constants.CONFIGUATION_FILEPATH);
		
		
		switch(ConfigsReader.getProperty("browser"))
		{
		case "chrome":
			driver=new ChromeDriver();
			break;
			
		case "firefox":
			driver=new FirefoxDriver();
			break;
			
		
			
			default:
				throw new RuntimeException("Other browsers are NOT supported");
		
		
		}
		
		driver.manage().window().maximize();
		driver.get(ConfigsReader.getProperty("url"));
	}
	
	/**
	 * This method will close the browser
	 */
	public static void tearDown() {
		if(driver !=null) {
			driver.quit();
			
		}
		
	}

}
