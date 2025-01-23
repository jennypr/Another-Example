package com.neotech.lesson10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Homework2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC: Delete Orders
		 * 
		 * 1) Open chrome browser 
		 * 2) Go to "https://neotech.vercel.app/web-orders"
		 * 3) Login to the application 
		 * 4) Click on the checkbox of all orders with product FamilyAlbum 
		 * 5) Delete Selected orders 
		 * 6) Verify the orders have been deleted 
		 * 7) Quit the browser
		 */
		
		setUp();
		
		//login 
		
				driver.findElement(By.id("username")).sendKeys("Tester");
				driver.findElement(By.id("password")).sendKeys("test");
				
				driver.findElement(By.id("btnLogin")).click();
				
				Thread.sleep(2000);
				
				//Let's get the data for column 3 for all table body rows
				List<WebElement> col3Values=driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
				
				for(int i=0; i<col3Values.size(); i++) 
				{
					String text =col3Values.get(i).getText();
				//	System.out.println("Column 3 Content --> "+ (i+1)+ " "+text);
					
					if(text.equals("FamilyAlbum")) 
					{
						driver.findElement(By.xpath("//table/tbody/tr["+(i+1)+"]/td[1]")).click();
					}
				}
				Thread.sleep(2000);
				
				driver.findElement(By.id("btnDelete")).click();
				
				Thread.sleep(3000);
				
				List<WebElement> col3ValuesUpdated = driver.findElements(By.xpath("//table/tbody/tr/td[3]"));
				boolean familyAlbumExists = false;
				
				for (int i = 0; i < col3ValuesUpdated.size(); i++)
				{
					String text = col3ValuesUpdated.get(i).getText();

					
					if (text.equals("FamilyAlbum"))
					{
						familyAlbumExists = true;
						break;
					}
				}
				
				if (familyAlbumExists)
				{
					System.out.println("Deletion Failed --> familyAlbum was found!");
				}
				else
				{
					System.out.println("Deletion Successful --> familyAlbum wasn't found!");
				}
				
				
		
		
		
		
		
		
		tearDown();
	}

}
