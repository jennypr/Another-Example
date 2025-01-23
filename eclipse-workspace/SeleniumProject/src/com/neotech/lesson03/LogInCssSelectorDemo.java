package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInCssSelectorDemo {
	
	public static final String url="https://sis.neotechacademy.com/";

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		//Send username and password using Css Selector locators
		
		driver.findElement(By.cssSelector("#tUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#tPassword")).sendKeys("Neotech123$");
		driver.findElement(By.className("input.buttonBig")).click();
		
		
		driver.quit();
	}

}
