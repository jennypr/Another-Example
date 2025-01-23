package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class DropDownDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		
		driver.findElement(By.id("tbxUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("tbxPassword")).sendKeys(ConfigsReader.getProperty("password"));
		
		Thread.sleep(3000);
		
		WebElement dd=driver.findElement(By.id("ddlAcademicYear"));
		Select selDD= new Select(dd); //we can do this If the web element is a select tag
		
		//can we do this in one line :
		
	// Select selDD= new Select (driver.findElement(By.id("ddlAcademicYear")));
		
		//1st way to select an option
		
		selDD.selectByIndex(0); //select the first option
		
		Thread.sleep(3000);
		
		selDD.selectByValue("2010");
		
		//2nd way to select an option
		
		Thread.sleep(3000);
		
		//3rd way to select an option
		
		selDD.selectByVisibleText("2014-15");
		Thread.sleep(3000);
		
		List<WebElement> options=selDD.getOptions();
		System.out.println("The size of the options is: "+options.size());
		
		for(int i=0; i<options.size();i++)
		{selDD.selectByIndex(i);
		Thread.sleep(2000);
			
		}
		
		
		
		
		tearDown();
	}

}
