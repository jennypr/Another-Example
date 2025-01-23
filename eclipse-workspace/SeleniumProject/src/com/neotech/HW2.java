package com.neotech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HW2 {
	
/*	HW2: Opening Page on Firefox Browser
	Open Firefox browser
	Navigate to “https://www.redfin.com/”
	Verify that you have navigated to (https://www.redfin.com/)
	End the Session (close the browser). */

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redfin.com/");
		
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.redfin.com/";
		
		if(actualUrl.equals(expectedUrl)) {
			System.out.println("I have succesfully navigated "+expectedUrl);
		} else {
			System.out.println("Url is wrong!");
		}
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
