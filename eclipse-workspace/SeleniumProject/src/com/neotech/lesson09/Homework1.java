package com.neotech.lesson09;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class Homework1 extends BaseClass {
	/*
	 * Homework 1: Use WebDriverWait Verify element is enabled

		 Open chrome browser
		 Go to "https://neotech.vercel.app/" 
		 Click on the "Interactions" link 
		 Then click on "Waits"
		 Click on enable button 
		 Enter "Hello" and verify text is entered successfully 
		 Close the browser
	 */

	public static void main(String[] args) throws InterruptedException {
		
		setUp(); 
		

		//waits:
		  //implicit wait: I want to be patient with all elements if an element is not there immediately
		 // wait for some time before complaining (ElementNotFound)
		//we declare this once and it will be active until we quit the driver
		
		//explicit wait : I want you to be patient only with this element because of THIS particular situation
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		 //What is the difference between this and sleep (15 seconds)???
		//in sleep , I will always wait 15 seconds and the locate the element
		//wait does not have to wait whole time, if the element is there, it continues
		
		//Click on the "Interactions" link
		driver.findElement(By.id("menu-interactions")).click();
		
		//Then click on "Waits"
		driver.findElement(By.id("waits")).click();
		
		//Click on enable button 
		
		driver.findElement(By.id("btnEnable")).click();
		
		//Enter "Hello" and verify text is entered successfully 
		
		//This textbox is there but not enabled!
		WebElement textbox=driver.findElement(By.xpath("//form[@id='input-example']/input"));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(textbox));
		
		textbox.sendKeys("Hello");
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		tearDown();
		
	}

}
