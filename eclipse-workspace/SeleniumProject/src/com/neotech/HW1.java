package com.neotech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
	
/*	HW1: Amazon Page Title Verification: 
		Open chrome browser
		Go to “https://www.amazon.com/”
		Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
		End the Session (close the browser). */

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		String actualTitle=driver.getTitle();
		String expectedTitle="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("The title is: "+driver.getTitle());
		} else {
			System.out.println("The title is: "+actualTitle);
			System.out.println("Title is wrong!");
		}
		
		//This is a Java method, not coming from Selenium
		//we use it to stop the code so we can visually inspect the result and test etc
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
