package com.neotech.lesson11;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class FacebookSignUp extends CommonMethods{

	public static void main(String[] args) {
		// https://www.facebook.com/r.php
		
		setUp();
		
		//Be careful with the index use, with visible text we get the
		//exact same value, but with index we would end up having + 1
		//For selecting day 10, we use index 9
		selectDropdown(driver.findElement(By.id("day")), 9);
		
		wait(2);
		
		selectDropdown(driver.findElement(By.id("month")), "Feb");
		//selectDropdown(driver.findElement(By.id("month")), 1);
		wait(2);
		
		selectDropdown(driver.findElement(By.id("year")), 2005);
		
		wait(2);
		
		tearDown();

	}

}