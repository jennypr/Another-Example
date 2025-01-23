package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Task1 extends BaseClass{

	public static void main(String[] args) {
		
		//url=https://www.facebook.com/r.php
		
		setUp();
		
		Select month =new Select(driver.findElement(By.id("month")));
		Select day =new Select(driver.findElement(By.id("day")));
		Select year =new Select(driver.findElement(By.id("year")));
		
		System.out.println("Number of items of month drop down is: "+month.getOptions().size());
		System.out.println("Number of items of day drop down is: "+day.getOptions().size());
		System.out.println("Number of items of year drop down is: "+year.getOptions().size());
		
		//Select your date of birth
		day.selectByIndex(13);
		month.selectByValue("6");
		month.selectByVisibleText("1994");
		
		
		
		
		
		
		tearDown();
	}

}
