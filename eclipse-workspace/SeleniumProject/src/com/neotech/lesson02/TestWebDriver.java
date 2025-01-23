package com.neotech.lesson02;

import java.util.Scanner;

public class TestWebDriver {
	
	static I_WebDriver driver;

	public static void main(String[] args) {
		
		//What If instead of me deciding which browser to use , I ask the user?
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Which browser to use?");
		
		String browser=scan.next();
		
		if(browser.equals("firefox")) 
		{
			C_FirefoxDriver driver= new C_FirefoxDriver();
		} else if(browser.equals("Chrome")) 
		{
			C_ChromeDriver driver=new C_ChromeDriver();
		} 
		else {
			System.out.println("There is not such browser! I will use Chrome");
			C_ChromeDriver driver=new C_ChromeDriver();
			
		}
		
		
		
		driver.get("https://www.amazon.com");
		driver.getTitle();
		driver.getCurrentUrl();
		driver.quit();
		
	}

}
