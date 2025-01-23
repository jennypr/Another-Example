package com.neotech.lesson08;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Homework2 extends BaseClass {
	/*
 1) Launch the browser and open the site "https://neotech.vercel.app/iframe/multi2"
2) Verify on the page header "Not a Friendly Topic" displayed
3) Click on the Inner Frame Check box
4) Choose Dog from Animals dropdown
5) Quit the browser

	 */

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		String label=driver.findElement(By.xpath("//span")).getText();
		System.out.println(label.equals("Not a Friendly Topic"));
		
		Thread.sleep(2000);
		
		//To check the inner-frame-check box we need to switch focus into the parent frame first, the into the child
		//after that we can check element
		
		//moving to parent frame
		driver.switchTo().frame("nested1");
		
		//now we should move to child frame
		
		driver.switchTo().frame("child-frame");
	
		
		driver.findElement(By.id("inner-frame-check-box")).click();
		Thread.sleep(2000);
		
		//Now , let's move focus into the default content back again
		driver.switchTo().defaultContent();
		
		//switch focus into animals frame
		driver.switchTo().frame("animals");
		Thread.sleep(2000);
		
		//Let's locate the selection element 
		Select sel=new Select(driver.findElement(By.id("animal-select")));
		
		sel.selectByVisibleText("Dog");
		
		Thread.sleep(2000);
		
	
		
		
		tearDown();
		

	}

}
