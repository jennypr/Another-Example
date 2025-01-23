package com.neotech.lesson13;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class FileUpload extends CommonMethods{

	public static void main(String[] args) {
		//https://the-internet.herokuapp.com/
		
		setUp();
		
		//Go to File Upload first 
		click(driver.findElement(By.linkText("File Upload")));
		
		//To upload a file, we cannot interact with our computers directly using Selenium
		//So, we would use the input element for uploading the file and pass to it the file path
		
		
		String filePath = System.getProperty("user.dir") + "/screenshot/HRM/Homework2.png";
		
		wait(3);
		
		sendText(driver.findElement(By.id("file-upload")), filePath);
		
		wait(4);
		
		click(driver.findElement(By.id("file-submit")));
		
		wait(3);
		
		tearDown();


	}

}