package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class NestedFrames extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// https://demoqa.com/nestedframes
		
		setUp();
		
		//To move the focus into Parent Frame we should switchTo () parent frame
		driver.switchTo().frame("frame1");
		Thread.sleep(2000);
		
		//Switch to child frame
		WebElement childFrame=driver.findElement(By.xpath("//iframe[@srcdoc ='<p>Child Iframe</p>']"));
		driver.switchTo().frame(childFrame);
		
		//To get the text from child frame we can locate its element and then display it
		WebElement element= driver.findElement(By.xpath("//body/p"));
		String text= element.getText();
		System.out.println("The text inside childframe is "+text);
		
		//Where are we at this point?
		  //We are indise child
		  //From child, we can go to parent or defaultContent()
		
		//1.Back to the parent
		
		//driver.switchTo().parentFrame(); //direct parent
		
		//2.Directly to defaultContent()
		driver.switchTo().defaultContent();
		
		
		
		
		
		tearDown();
		
		

	}

}
