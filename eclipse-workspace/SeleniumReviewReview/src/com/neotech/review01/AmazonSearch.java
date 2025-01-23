package com.neotech.review01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(3000);
		
		//We have 8 locators: id,name,className,LickText,partialLinkedText,tagName,xpath,cssSelector
		
		//locate the text box
		
		WebElement searchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("deck lights");
		
		WebElement searchBtn=driver.findElement(By.xpath("//input[@type='submit']"));
	}

}
