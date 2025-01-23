package com.neotech.lesson07;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Homework2 extends BaseClass{
	
//  Alert text verification
//  Open Chrome browser
//  Go to https://neotech.vercel.app
//  Click on "Alerts, Frame & Windows" link
//  Click on "Alerts" links on the left side
//  Click on "Show Alert" button to see Alert
//  Verify alert box with text "You clicked a button" is present
//  Click on 3rd button("Show Confirm") in the page
//  Verify alert box with text "Do you confirm action?" is present and click "OK"
//  Click on 4th button("Show prompt") in the page and enter your name and click OK.
//  Quit browser



	public static void main(String[] args) throws InterruptedException {
		// https://neotech.vercel.app
		
		setUp();
		
//		 Click on "Alerts, Frame & Windows" link
		driver.findElement(By.id("menu-alerts")).click();
		Thread.sleep(2000);
		
	//  Click on "Alerts" links on the left side		
		driver.findElement(By.id("alerts")).click();
		Thread.sleep(2000);
		
	//  Click on "Show Alert" button to see Alert
		driver.findElement(By.id("btnAlert")).click();
		Thread.sleep(2000);
		
		//At this point, an alert will pop-up 
		//We should move the focus from the default content into the alert
		Alert alert = driver.switchTo().alert();
		
	//  Verify alert box with text "You clicked a button" is present
		System.out.println("The text of the alert --> " + alert.getText());
		
		//We need to end the alert --> we can accept it
		alert.accept();
		Thread.sleep(2000);

	//  Click on 3rd button("Show Confirm") in the page
		driver.findElement(By.id("btnConfirm")).click();
		Thread.sleep(2000);

		
	//  Verify alert box with text "Do you confirm action?" is present and click "OK"
		
		//We can use the same Alert object alert to re-assign an alert to it.
		alert = driver.switchTo().alert();
		System.out.println("The text of the alert --> " + alert.getText());
		alert.accept();
		Thread.sleep(2000);

	//  Click on 4th button("Show prompt") in the page and enter your name and click OK.
		driver.findElement(By.id("btnPrompt")).click();
		//Let's re-assign the alert
		alert = driver.switchTo().alert();
		//Let's send our admin user name
		alert.sendKeys("Jenny");
		Thread.sleep(4000);
		alert.accept();
		Thread.sleep(2000);
		
		tearDown();
		

	}

}