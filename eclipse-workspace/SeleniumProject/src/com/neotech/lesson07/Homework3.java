package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Homework3 extends BaseClass{
	
//  Open chrome browser
//  Go to "https://neotech.vercel.app/select"
//  Click on multi select drop down and select "Oliver Hansen" and "Van Henry"
//  Verify value has been selected
//  Deselect 1 of the options from the dropdown
//  Quit browser


	public static void main(String[] args) throws InterruptedException {
		setUp();
		
		WebElement multiSelect=driver.findElement(By.id("demo-multiple-name"));
		multiSelect.click();
		Thread.sleep(2000);
		
		//Click to select Oliver Hansen
		driver.findElement(By.xpath("//li[text()='Oliver Hansen']")).click();
		
		//click to select Van Henry
		driver.findElement(By.xpath("//li[text()='Van Henry']")).click();
		
		Thread.sleep(2000);
		
		//Verify that Oliver Hansen has been selected
		//We will use multiSelect variable to get selected elements
		
		String selection=multiSelect.getText();
		
		if(selection.contains("Oliver Hansen")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		//Let's de-select Oliver Hansen
		
		
		driver.findElement(By.xpath("//li[text()='Oliver Hansen']")).click();
		
		Thread.sleep(2000);
		
		
		
		
		tearDown();
		
		
	}

}
