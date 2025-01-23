package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class ImplicitWaitDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// https://neotech.vercel.app/waits

		setUp();
		
		//Waiting for the URL to load after it's been loaded is useless
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	//Implicit wait
		 //1.It's used at the driver level--> will be applied for all elements located by the driver
		 //2. it's applicable for findElement() and findElements() 
		     //When we try to locate an element or elements, the implicit time will be applied to this process
	   //If the request is sent directly with no wait, and the element is still not loaded, then we would get NoSuchElementException
		
		//If we use implicit wait, we would tell the driver to wait for max x amount of seconds before throwing this error
		  //If the element is found at any point before the time is over, there will be no more wait
		  //if the element is not found until time is over, the driver will check one last time and then throw NoSuchElementException
		//By default implicit wait is 0 seconds
		
		//If we want to set the implicit time to 15 seconds,
		 //then we should do this tight after driver is initialized-->tight after calling setUp()
		//this wait will be for every element we try to locate and it will remain until the driver is terminated
		//The default polling/checking time is 0.5 second
		//It will wait until either the element is found or the time is over
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//the driver will wait up to 15 seconds while locating any element
		
	WebElement button=driver.findElement(By.id("button1"));
	button.click();
		
	Thread.sleep(3000);
		
		
		tearDown();
	}

}
