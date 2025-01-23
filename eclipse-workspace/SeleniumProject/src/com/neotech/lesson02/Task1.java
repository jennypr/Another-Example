package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
/*	TC 2: Mercury Tours Registration:

		➔ Open chrome browser
		➔ Go to “https://demo.guru99.com/test/newtours/”
		➔ Click on Register Link
		➔ Fill out ALL required info
		➔ Click Submit

		➔ User successfully registered
		➔ (Create the script using different locators) */
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		Thread.sleep(4000);
		
		//find an element with an anchor tag <a.. that has the text REGISTER
		driver.findElement(By.linkText("REGISTER")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.name("firstName")).sendKeys("Jenny");
		driver.findElement(By.name("lastName")).sendKeys("Porja");
		driver.findElement(By.name("phone")).sendKeys("57378");
		driver.findElement(By.id("userName")).sendKeys("jennypr@gmail.com");
		
		Thread.sleep(3000); //So that we can see
		
		driver.findElement(By.name("submit")).click();
		
		
		
		driver.quit();
		
	}

}
