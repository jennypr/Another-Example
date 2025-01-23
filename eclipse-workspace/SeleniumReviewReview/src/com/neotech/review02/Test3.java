package com.neotech.review02;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Test3 extends BaseClass {
	
	// Login to SIS Web Application
	// https://sis.neotechacademy.com/
	// username -> Admin
	// password -> Neotech$123

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("tUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("tPassword")).sendKeys(ConfigsReader.getProperty("password"));
		driver.findElement(By.id("bLogin")).click();
		
		Thread.sleep(3000);
		
		tearDown();
	}

}
