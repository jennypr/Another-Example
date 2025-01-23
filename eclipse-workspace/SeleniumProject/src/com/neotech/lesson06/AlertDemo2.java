package com.neotech.lesson06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class AlertDemo2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// https://neotech.vercel.app/alerts
		
		setUp();
		driver.findElement(By.id("btnAlert")).click();
		Thread.sleep(2000);
		
		Alert simpleAlert=driver.switchTo().alert();
		
		
		
		String alertText=simpleAlert.getText();
		
		System.out.println("Simple Alert says: "+alertText);
		
		simpleAlert.accept();
		
		Thread.sleep(2000);
		
		
		//trigger alert
		driver.findElement(By.id("btnConfirm")).click();
		Thread.sleep(2000);
		Alert confirmAlert=driver.switchTo().alert();
		System.out.println(confirmAlert.getText());
		confirmAlert.dismiss();
		
		driver.findElement(By.id("btnPrompt")).click();
		Thread.sleep(2000);
		
		Alert promptAlert=driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		promptAlert.sendKeys("Neo Tech");
		Thread.sleep(2000);
		promptAlert.accept();
		
		
		
		
		
		
		tearDown();
		

	}

}
