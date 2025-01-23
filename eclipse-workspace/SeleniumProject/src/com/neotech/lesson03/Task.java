package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	
	public static final String url="https://www.facebook.com/";

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jenny@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hdgw7");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		Thread.sleep(3000);
		
		String expectedUrl = "https://www.facebook.com/";
		String actualUrl = driver.getCurrentUrl();
		
		if (expectedUrl.equals(actualUrl))
		{
			System.out.println("Your login was successful!");
		}
		else
		{
			System.out.println("Username or password incorrect!!");
		}
		
		System.out.println();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
