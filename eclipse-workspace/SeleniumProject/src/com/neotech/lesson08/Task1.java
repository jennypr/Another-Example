package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class Task1 extends BaseClass{
	
//    Verify element is present
//    Open chrome browser
//    Go to "https://the-internet.herokuapp.com/"
//    Click on the "Dynamic Loading" link
//    Click on "Example 1..." and click on "Start"
//    Verify element with text "Hello World!" is displayed
//    Close the browser 


	public static void main(String[] args) {
		// https://the-internet.herokuapp.com/
		
		setUp();
		
		driver.findElement(By.linkText("Dynamic Loading")).click();
		
		driver.findElement(By.partialLinkText("Example 1")).click();
		
		driver.findElement(By.tagName("button")).click();
		//We can use xpath with //div[@id='start']/button, //button, //button[text()='Start']
		
		//To get the displayed text, we need to wait for some time --> until it loads
		//For that, we would apply explicit wait for a specific element 
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		//Now, we will use the wait object to wait for the element to be visible for example
			
			//In this case, we are using (1) condition, and (2) a specific element
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']/h4")));
		
		WebElement textBox = driver.findElement(By.xpath("//div[@id='finish']/h4"));
		
		System.out.println(textBox.isDisplayed());
		System.out.println(textBox.getText());
		
		
		tearDown();

	}

}