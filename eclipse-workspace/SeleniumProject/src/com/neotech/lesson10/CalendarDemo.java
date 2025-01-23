package com.neotech.lesson10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class CalendarDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		 // https://www.delta.com/
		
		setUp();
		
		//There are some element located in some seconds, so let's apply an implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("calDepartLabelCont")).click();
		
		//Let's select July,20 for departure
		
		//Locate the month
		
		String currentMonth = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		
		Thread.sleep(2000);
		
		
		tearDown();

	}

}
