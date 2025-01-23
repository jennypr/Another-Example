package com.neotech.lesson08;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.neotech.utils.BaseClass;

public class Homework1 extends BaseClass {
	
	/*
	 * 1) Launch the browser and open the site "https://neotech.vercel.app/email"
2) Click on link "Click Here". When the user clicks on the "Click Here" link, new child window opens.
3) On the Child Window, Enter your email ID and submit.
4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
5) Close the Child window on which credentials are displayed. Switch to the parent window.
6) Quit all browsers
	 */

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.findElement(By.linkText("Click Here")).click();
		
		//At this point we opened a new window but the focus is still on the main url window
		 //-->it means we have two window handles
		
		//How to get these handles?
		
		Thread.sleep(2000);
		
		Set<String> handles=driver.getWindowHandles();
		System.out.println("Number of handles is "+handles.size());
		
		Iterator<String> it=handles.iterator();
		
		String parentWindow=it.next();
		String childWindow=it.next();
		
		Thread.sleep(2000);
		
		//we need to switch the focus to the childWindow/tab
		
		driver.switchTo().window(childWindow);
		
		driver.findElement(By.id("emailid")).sendKeys("test@me.com");
		driver.findElement(By.id("btnLogin")).click();
		
		//Let's get the user-name
		String username=driver.findElement(By.id("username")).getText();
		
		//Let's get password
		String password=driver.findElement(By.id("password")).getText();
		
		System.out.println("The username is : "+username+" and the password is : "+ password);
		
		//To switch the focus back to the main window we can either close the current tab or switchTo(parentWindow)
		
		driver.close();
		
		//or
		//driver.switchTo().window(parentWindow);
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		tearDown();
		
		
		

	}

}
