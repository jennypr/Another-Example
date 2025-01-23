package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	
	/* TC 1: Facebook login: 
	        Open chrome browser
	        Go to "https://www.facebook.com/"
	        Enter valid username and valid password and click login 
	        User successfully logged in 
	        Using only Css selector
	        */
	

	public static final String url="https://www.facebook.com/";

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("jenny@gmail.com");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("jdh638");
		
		
		
		driver.quit();
		
		
	}

}
