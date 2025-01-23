package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//1st way is to get the URL
		//driver.get("https://www.zillow.com/"); --> does not maintain history
		
		//2nd way to go to url . navigate().to()
		driver.navigate().to("https://www.zillow.com/"); //it will maintain history to use back
		
		Thread.sleep(4000);
		
		//maximize screen
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(4000);
		
		driver.navigate().back(); //get back to the previous page
		
		Thread.sleep(4000);
		
		driver.navigate().refresh();
		
		String url="https://www.zillow.com/";
		String actualUrl=driver.getCurrentUrl();
		

		if (url.equals(actualUrl))
		{
			System.out.println("Test Passed!");
		}
		else
		{
			System.out.println("Test Failed!");
			System.out.println("Current Url: " + actualUrl);
			System.out.println("Expected Url: " + url);
		}
		
		
		driver.quit();
	}

}
