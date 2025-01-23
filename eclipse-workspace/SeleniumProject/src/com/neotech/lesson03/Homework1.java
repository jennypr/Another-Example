package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
	/* Using xPath ONLY
    TC 2: Mercury Tours Registration: 
        Open chrome browser
        Go to “http://demo.guru99.com/test/newtours/”
        Click on Register Link
        Fill out all required info
        Click Submit
        User successfully registered */

	public static final String url="https://demo.guru99.com/test/newtours";
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		
		
		
		
		
		
		driver.quit();
	}

}
