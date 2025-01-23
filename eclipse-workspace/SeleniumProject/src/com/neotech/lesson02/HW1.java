package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
	
	/*Open Chrome Browser
	 * Go to "https://demo.guru99.com/test/newtours/"
	 * Click on Register Link
	 * Fill out all required info
	 * Click submit
	 * User successfully registered
	 * (Create the script using different locators)
	 */
	
	public static final String url="https://demo.guru99.com/test/newtours";

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.name("firstName")).sendKeys("Jenny");
		driver.findElement(By.name("lastName")).sendKeys("Pr");
		driver.findElement(By.name("phone")).sendKeys("989 987 6534");
		driver.findElement(By.id("userName")).sendKeys("jenny@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Jackson Ave");
		driver.findElement(By.name("city")).sendKeys("NYC");
		driver.findElement(By.name("state")).sendKeys("New York");
		driver.findElement(By.name("postalCode")).sendKeys("10022");
		driver.findElement(By.name("country")).sendKeys("USA");
		
		driver.findElement(By.id("email")).sendKeys("Jennypr");
		driver.findElement(By.name("password")).sendKeys("73y6");
		driver.findElement(By.name("confirmPassword")).sendKeys("73y6");
		
		driver.findElement(By.name("submit")).click();
		
		String expectedUrl = "https://demo.guru99.com/test/newtours/register_sucess.php";
		String actualUrl = driver.getCurrentUrl();
		
		if (expectedUrl.equals(actualUrl))
		{
			System.out.println("The registration was successful!");
		}
		else
		{
			System.out.println("The registeration failed!!");
		}
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
		
		
		
		

	}

}
