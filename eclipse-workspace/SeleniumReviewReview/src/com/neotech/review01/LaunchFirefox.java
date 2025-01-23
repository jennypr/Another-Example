package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		
		String url= "https://www.nytimes.com/";
		driver.get(url);
		
		Thread.sleep(5000);
		
		String currentUrl=driver.getCurrentUrl();
		
		if(url.equals(currentUrl)) {
			System.out.println("Url's are the same !");
		} else {
			System.out.println("Url's are different!");
		}
		
		String title=driver.getTitle();
		System.out.println("Title is "+title);
	}

}
