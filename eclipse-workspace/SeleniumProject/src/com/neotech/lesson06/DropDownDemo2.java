package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class DropDownDemo2 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		//https://neotech.vercel.app/select
		
		setUp();
		
		//we locate the element first
		
		WebElement oldMenu=driver.findElement(By.id("oldSelectMenu"));
		//this element is a select tag
		Select sl=new Select(oldMenu);
		sl.selectByIndex(2);
		Thread.sleep(3000);
		
		//locate the other drop down
		
		WebElement otherMenu=driver.findElement(By.id("demo-multiple-name"));
		//this element has a label tag
		otherMenu.click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//li[text()='Omar Alexander']")).click();
		
		
		
		
		tearDown();
	}

}
