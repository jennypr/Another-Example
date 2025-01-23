package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class ExplicitWaitDemo extends BaseClass {

	public static void main(String[] args) {
		 // https://neotech.vercel.app/waits
		
		setUp();
		
		//Explicit wait 
		  //It's applied to an element not to driver level
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		//If the element is not found within 15 seconds timeout exception will be thrown
		
		
		//Now , we can use the wait object to specify the waiting process
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button1")));
		
		WebElement button=driver.findElement(By.id("button1"));
		
		System.out.println("The invisible is not visible: "+button.isDisplayed());
		
		button.click();
		
		
		tearDown();

	}

}
