package com.neotech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//If we want to test anything in a web-application , we should follow these steps:
		
		//1.Open the browser
		
		WebDriver driver=new ChromeDriver();
		
		
		//2.Go to the URL
		
		driver.get("https://www.neotechacademy.com/");
		//3.DO the required tests or actions
		
		Thread.sleep(5000);
		
		//4.Close the browser
		
		driver.quit();
	}

}
