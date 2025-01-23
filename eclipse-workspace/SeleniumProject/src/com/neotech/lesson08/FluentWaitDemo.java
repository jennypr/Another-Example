package com.neotech.lesson08;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.neotech.utils.BaseClass;

public class FluentWaitDemo extends BaseClass{

	public static void main(String[] args) {
		// https://neotech.vercel.app/waits
		
		//We can use both implicit and explicit waits in the same test
		
		setUp();
		
		//Explicit waits:
	//	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		 // wait.until();
		  
		
		//Fluent wait
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(15));
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button1")));
		
		
		
		
		
		
		tearDown();

	}

}
