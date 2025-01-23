package com.neotech.lesson10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * ================== Lesson 09 HW 1 ======================= 
		 * TC: Update Customer Information
		 * 
		 * 1) Open chrome browser 
		 * 2) Go to "https://neotech.vercel.app/web-orders"
		 * 3) Login to the application 
		 * 4) Verify customer "Susan McLaren" is present in the table 
		 * 5) Click on customer details 
		 * 6) Update customers last name and credit card info 
		 * 7) Verify updated customers name and credit card number is displayed in table 
		 * 8) Close browser
		 */
		
		setUp();
		
		//let's check the test first before applying any waits
		
		//login 
		
		driver.findElement(By.id("username")).sendKeys("Tester");
		driver.findElement(By.id("password")).sendKeys("test");
		
		driver.findElement(By.id("btnLogin")).click();
		
		//Get all costumer rows from the table
		
		List<WebElement> rows= driver.findElements(By.xpath("//table[@id='ordersTable']/tbody/tr"));
		
		//Let's save the full name in a variable so that can use it later on
		WebElement fullName=null;
		
		for(int i=0; i<rows.size(); i++) 
		{
			fullName=driver.findElement(By.xpath("//table[@id='ordersTable']/tbody/tr["+(i+1)+"]/td[2]"));
			//System.out.println("Full name: "+fullName.getText());
			if(fullName.getText().contains("Susan McLaren")) 
			{
				//Locate the row that has Susan in it and then move to action col and click edit
				driver.findElement(By.xpath("//table[@id='ordersTable']//tbody/tr["+ (i+1) +"]/td[13]")).click();
				
				Thread.sleep(2000);
				break;
		}
			
			WebElement cName=driver.findElement(By.id("tb_fullName"));
			//If we get text using .getText(), we would end up having empty string=no text on the element
			//Alternatively, we will get the attribute value that had the name
			String cNameText=cName.getDomAttribute("value");
			System.out.println("Current name"+cNameText);
			Thread.sleep(2000);
			
			cName.clear();
			Thread.sleep(2000);
			
			cName.sendKeys("Susan Smith");
			
			Thread.sleep(2000);
			
			WebElement CC = driver.findElement(By.id("tb_cardNumber"));
			CC.clear();
			CC.sendKeys("72638490");
			
			Thread.sleep(2000);
			
			driver.findElement(By.id("btnSave")).click();
			Thread.sleep(2000);

			
			//To verify that the name is update, we may have two possibilities:
				//(1) The record will remain in its place (index) in the table --> we can use the fullName we created earlier
				//(2) The record changes according to some dynamic table design --> do the search again
			
			
			//Let's follow the second possibility, you can do the first one as task
			System.out.println("Updated Name --> " + fullName.getText());
		
		
		tearDown();
		
	}

	}
	}
