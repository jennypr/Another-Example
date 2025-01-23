package com.neotech.lesson06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class AlertDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		//url=https://neotech.vercel.app/delete-customer
		setUp();
		
		driver.findElement(By.id("customerId")).sendKeys("1234");
		driver.findElement(By.id("submit")).click();
		
		//at this point I have triggered the alert!!!
		
		Thread.sleep(2000);
		
		//shift the focus from the page to alert
		
		Alert simpleAlert=driver.switchTo().alert();
		String alertText=simpleAlert.getText();
		System.out.println("The simple alert text is: "+alertText);
		
		simpleAlert.dismiss(); //cancel
		//we are now back on the page
		
		
		//let's click again to trigger the alert
		
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		
		Alert secondAlert=driver.switchTo().alert();
		secondAlert.accept(); //ok
		
		//when I click ok , another alerts triggered
		
		Alert lastConfirmationAlert=driver.switchTo().alert();
		System.out.println(lastConfirmationAlert.getText());
		lastConfirmationAlert.accept();
		
		
		
		
		
		
		tearDown();
	}

}
