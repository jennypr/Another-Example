package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	
/*	// Open Chrome browser
	// Navigate to https://www.selenium.dev/
	// Navigate to https://www.google.com/
	// Go back and forth 10 times.
	// Use a for loop
	// Wait 1 second between each navigation */
	
	static String url="https://www.selenium.dev/";
	static String url2="https://www.google.com/";

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		
		for(int i=0; i<=9; i++) 
		{
			driver.navigate().to(url);
			Thread.sleep(1000);
			driver.navigate().to(url2);
			Thread.sleep(1000);
			driver.navigate().back();
		}
		
		driver.quit();
		
	}

}
