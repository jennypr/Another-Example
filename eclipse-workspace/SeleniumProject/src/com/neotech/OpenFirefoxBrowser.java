package com.neotech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//We do not need to add any JAR file.
		//Selenium WebDriver will manage downloading the required driver for any browser
		  //in older versions, we had to do that ourselves
		
		//So, what are the steps to follow?
		//1.Open the Firefox browser
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.neotechacademy.com/");
		
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.neotechacademy.com/";
		
		if(actualUrl.equals(expectedUrl)) 
		{
			System.out.println("Page Title"+driver.getTitle());
		}
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
