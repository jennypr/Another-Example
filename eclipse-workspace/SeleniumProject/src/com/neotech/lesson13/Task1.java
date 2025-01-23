package com.neotech.lesson13;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;

public class Task1 extends CommonMethods {

	public static void main(String[] args) {
		/*
	 	TC 1: Upload file and Take Screenshot
		Navigate to "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload"
		Upload file
		Verify file got successfully uploaded and take screenshot 
 
	 */
	setUp();
	
	//You could locate any other file on your system!!
	String filePath = System.getProperty("user.dir") + "/screenshots/Lesson13/Homework2.png";
	
	//send the location of the file (image) to the input element 
	//driver.findElement(By.id("gwt-debug-cwFileUpload")).sendKeys(filePath);
	sendText(driver.findElement(By.id("gwt-debug-cwFileUpload")), filePath);
	
	wait(15);
	
	//Upload the file
	click(driver.findElement(By.xpath("//button")));
	
	//Handle the alert
	System.out.println("Alert text --> " + getAlertText());
	acceptAlert(); // we could also dismiss it
	
	//Take a screenshot 
	
	//cast the driver as a TakesScreenshot object
	TakesScreenshot ts = (TakesScreenshot) driver;
	
	//create the source file of the screenshot
	File sf = ts.getScreenshotAs(OutputType.FILE);
	
	//now. save the screenshot file
	try {
		Files.copy(sf, new File("screenshots/Lesson13/FileUpload.png"));
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	tearDown();

	}

}
