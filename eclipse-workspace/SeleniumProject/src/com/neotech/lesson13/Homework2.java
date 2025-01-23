package com.neotech.lesson13;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework2 extends CommonMethods{

	public static void main(String[] args) {
		/*
	 	Go to https://hrm.neotechacademy.com/
		Log in using our custom methods
		Go to PIM menu
		Add an employee
		Go to Employee List
		Get the list of the employees (Using tables - tr and td) 
		Loop to search for the employee you added
		When you find the employee - click on it.
		Take a screenshot
	 */
		
		setUp();
		
		//Login
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
		click(driver.findElement(By.xpath("//button")));
		
		//Navigate to PIM
		click(driver.findElement(By.id("menu_pim_viewPimModule")));
		
		//Click on Add Employee
		click(driver.findElement(By.linkText("Add Employee")));
		
		//wait for the visibility of first name box --> which means the visibility of the whole form
		waitForVisibility(By.id("first-name-box"));
		
		sendText(driver.findElement(By.id("first-name-box")), "Jane");
		sendText(driver.findElement(By.id("last-name-box")), "Doe");
		
		//get the ID to search for the employee later on
		String employeeID = driver.findElement(By.id("employeeId")).getDomProperty("value");
		
		//select the location --> we use our selectDropdown() method
		selectDropdown(driver.findElement(By.id("location")), "Canadian Development Center");
		
		//Click on save
		wait(3); //To overcome save button clickability issue, we wait for a few seconds 
		
		click(driver.findElement(By.id("modal-save-button")));
		
		wait(10);
		//Go to Employee List
		click(driver.findElement(By.linkText("Employee List")));
		
		//Let's get all employee IDs and search to find our employee
		//Once found, we click on it
		
		boolean found = false;
		
		while(!found)
		{
			wait(2);
			
			//Get all id's in the current page and check them
			List<WebElement> idList = driver.findElements(By.xpath("//table[@id='employeeListTable']//td[2]"));
			
			for (WebElement id : idList)
			{
				if (id.getText().equals(employeeID))
				{
					found = true;
					id.click();
					break;
				}
			}
			
			//There is a possibility that we need to move to next page to check the employee
			//and repeat the same process
			
			if (!found)
			{
				System.out.println("Checking on next page...");
				click(driver.findElement(By.xpath("//i[text()='chevron_right']")));
			}
		}
		
		waitForVisibility(By.id("firstName"));
		
		//Let's take a screenshot
			//get the TakesScreenShot created
		TakesScreenshot ts = (TakesScreenshot) driver;
		
			//create the file --> actually taking the screenshot
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
			//Save the created source file
		try {
			Files.copy(sourceFile, new File("screenshots/Lesson13/Homework2.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		tearDown();

	}

}