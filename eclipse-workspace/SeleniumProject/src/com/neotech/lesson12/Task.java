package com.neotech.lesson12;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Task extends CommonMethods {

	public static void main(String[] args) throws IOException {
		setUp();
		
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
	
		
       click(driver.findElement(By.xpath("//button")));
		
		wait(4);
		
TakesScreenshot ts= (TakesScreenshot)driver ;
		
		
		File source=ts.getScreenshotAs(OutputType.FILE);
	
			Files.copy(source, new File("screenshot/HRM/dashboard2.png"));
		
			
			
		
		tearDown();
	}

}
