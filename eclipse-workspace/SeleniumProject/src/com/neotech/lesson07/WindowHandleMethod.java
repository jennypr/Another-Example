package com.neotech.lesson07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class WindowHandleMethod extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		//https://accounts.google.com/lifecycle/steps/signup/name?ddm=1&dsh=S-1624131863:
		//1736625968108030&flowEntry=SignUp&flowName=GlifWebSignIn&TL=AO-GBTdHey2e9UAS30eD-rg5
		//_R4PQ-AoivL-_5bhlEn9YIFEETRcY70sQu1jr965&continue=https://accounts.google.com/ManageAccount?nc%3D1
		
		setUp();
		
		System.out.println("The title-->"+driver.getTitle());
		
		System.out.println("Window Handle-->"+driver.getWindowHandle());
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(2000);
		
		
		Set<String> allWindowHandles=driver.getWindowHandles();
		System.out.println("Number of handles: "+allWindowHandles.size());
		
		Iterator<String> it=allWindowHandles.iterator();
		
		String window1=it.next();
		String window2=it.next();
		
		System.out.println("Window1--> "+window1);
		System.out.println("Window2--> "+window2);
		
		Thread.sleep(2000);
		
		//switch to the other window
		
		driver.switchTo().window(window2);
		
		//To verify that we moved, let's get the title and display it
		
		String title2=driver.getTitle();
		
		System.out.println("Title--> "+title2);
		
		driver.close();
		
		
		tearDown();
		
	}

}
