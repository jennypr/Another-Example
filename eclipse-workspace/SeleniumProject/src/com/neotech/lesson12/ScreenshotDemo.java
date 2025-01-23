package com.neotech.lesson12;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class ScreenshotDemo extends CommonMethods {

	public static void main(String[] args) {
		// https://hrm.neotechacademy.com
		
		setUp();
		
		//let's login
		
		//send username
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty(("password")));
		
		//click on login
		click(driver.findElement(By.xpath("//button")));
		
		wait(4);
		
		//I want to take a screenshot
		  //1.describe the step by step process of taking a photo (with a camera or your phone)
		  //2.Open the camera on the phone(or get the camera)
		  //3.Save the photo(store it somewhere)
		
		//1.Create an object of TakesScreenshot
		TakesScreenshot ts= (TakesScreenshot)driver ;
		
		//2.Take the photo
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		//3.Save the photo
		try {
			Files.copy(source, new File("screenshot/HRM/dashboard1.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("Unable to save the screenshot");
		}
		
		
		
		
		
		tearDown();
	}

}
