package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class MultipleSelectionDropDown extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement multiSelect=driver.findElement(By.id("multi-select"));
		
		//create a select object
		
		Select sel= new Select(multiSelect);
		
		sel.isMultiple(); // is like a boolean , it will return true or false
		
		boolean isMlp=sel.isMultiple();
		
		if(isMlp)
		{
			List<WebElement> options=sel.getOptions();
			for (WebElement el: options) {
				String text=el.getText();
				
				System.out.println("The visible test is: "+text);
				
				sel.selectByVisibleText(text);
				Thread.sleep(2000);
			}
			
			sel.deselectByIndex(0);
			Thread.sleep(2000);
			
			sel.deselectAll();
			Thread.sleep(2000);
			
		}
		
		
		
		
		
		tearDown();
		
	}

}
