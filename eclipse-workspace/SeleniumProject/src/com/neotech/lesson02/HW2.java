package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
	
	/*Facebook sign up
	 * Open Chrome Browser
	 * Go to https://www.facebook.com/
	 * Click on sign up link
	 * Enter First Name
	 * Enter Last Name
	 * Enter email
	 * Re enter email
	 * Click on sign up button
	 */

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Jenny");
		driver.findElement(By.name("lastname")).sendKeys("Pr");
		driver.findElement(By.id("month")).sendKeys("Jun");
		driver.findElement(By.id("day")).sendKeys("12");
		driver.findElement(By.name("birthday_year")).sendKeys("1994");
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("984 753 9456");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("hfksl929");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("websubmit")).click();
		
		System.out.println("You have successfully created an account!");
		
		Thread.sleep(4000);
		
		driver.quit();
		
	}

}
