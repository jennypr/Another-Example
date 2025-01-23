package com.neotech.lesson11;

import org.openqa.selenium.By;
import com.neotech.utils.CommonMethods;

public class AlertTest extends CommonMethods{

	public static void main(String[] args) {
		// https://neotech.vercel.app/delete-customer
		
		setUp();
		
		driver.findElement(By.id("customerId")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		
		wait(2);
		
		System.out.println("Alert text --> " + getAlertText());
		
		wait(2);
		
		dismissAlert();
		
		
		tearDown();

	}

}