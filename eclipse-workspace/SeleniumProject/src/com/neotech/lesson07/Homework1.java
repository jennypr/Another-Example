package com.neotech.lesson07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Homework1 extends BaseClass {
	
	//Amazon Department List Verification
	//Open Chrome browser
	//Go to amazon
	//Verify how many department option available
	//Print each department
	//Select computers
	//Quit browser

	public static void main(String[] args) throws InterruptedException {
		// https://www.amazon.com/
		
		setUp();
		
		//Thread.sleep(100000);
		
		WebElement department = driver.findElement(By.id("searchDropdownBox"));
		
		Select departmentDd= new Select(department);
		
		List <WebElement> options =departmentDd.getOptions();
		
		Thread.sleep(2000);
		
		System.out.println("There are "+options.size()+" departments.");
		
		for (WebElement e: options) {
			System.out.println(e.getText());
		}
		
		//extra bonus
		//Let's search for a book in Books
		//Select Books from the list of dropdown
		departmentDd.selectByVisibleText("Books");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("The 48 laws of Power"); 
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(2000);
		
		//This part is left for u 
		  //Verify the result is correct
		
		tearDown();
		
		
		
		
		
		tearDown();
		
		

	}

}
