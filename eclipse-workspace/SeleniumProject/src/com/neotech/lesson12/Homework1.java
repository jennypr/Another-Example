package com.neotech.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class Homework1 extends CommonMethods{

	public static void main(String[] args) {
		// Homework 1:
	   // FrameDemo at com.neotech.lesson07 using the CommonMethods.java
		
		setUp();
		
		//1.switch to frame using index
		switchToFrame(0); 
		
		WebElement age=driver.findElement(By.id("age"));
		sendText(age, "30");
		
		wait(3);
		
		
		
		
		
		tearDown();

	}

}
