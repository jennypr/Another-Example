package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class FrameDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// https://jqueryui.com/tooltip/
		
		setUp();
		
		//If we try to send age without switching focus to frame,
		//we would get NoSuchElementException
		  //Why?--> The focus is currently  on the default elements which doesn't have this element
		//It's inside a frame(iFrame)
		
		//1.switch to frame by index
		
		driver.switchTo().frame(0);
		WebElement age=driver.findElement(By.id("age"));
		age.sendKeys("42");
		Thread.sleep(2000);
		
		//Let's try to click on some button from the default page contents 
		  //Without switching back to the main page contents we won't be able to locate any of its elemetns
		  //We must switch back to it and the locate and do the needful action 
		
	//	driver.findElement(By.linkText("Button")).click(); -->this won't work
		//Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		//driver.findElement(By.linkText("Button")).click();
		//Thread.sleep(2000);
		
		//2.Switch to frame by name or ID
		//driver.switchTo().frame(frameNameorID); --> for this example we don't have name or ID
		
		//3.switch to frame by WebElement
		
		WebElement frameElement=driver.findElement(By.xpath("//ifframe[@class='demo-frame']"));
		driver.switchTo().frame(frameElement);
		age.clear();
		Thread.sleep(2000);
		//Let's send a new age value
		age.sendKeys("30");
		Thread.sleep(2000);
		
		//If your test requires getting back to the default content then switch back to default
		driver.switchTo().defaultContent();
		
		
		
		
		
		tearDown();
		
		

	}

}
