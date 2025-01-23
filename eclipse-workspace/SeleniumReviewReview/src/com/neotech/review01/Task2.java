package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	// Go to https://demoqa.com/text-box
			// Fill the form and submit
			// Use xPath or CSS Selector
	
	static String url="https://demoqa.com/text-box";
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver ();
		
		driver.navigate().to(url);
		
		driver.findElement(By.cssSelector("#userName")).sendKeys("Jenny");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("jenny@gmail.com");
		driver.findElement(By.cssSelector("#currentAddress")).sendKeys("High Avenue");
		driver.findElement(By.xpath("//*[@id='permanentAddress']")).sendKeys("York Avenue");
		driver.findElement(By.xpath("//*[@id='submit']")).click();
		
		Thread.sleep(4000);
		
		driver.quit();
		
		

	}

}
