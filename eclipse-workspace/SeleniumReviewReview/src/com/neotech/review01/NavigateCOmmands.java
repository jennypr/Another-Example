package com.neotech.review01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCOmmands {
	
	static String url="https://www.selenium.dev/";

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get(url); --> this what we will use most of the time
		//1.this will load the page for given url , but it will NOT keep history
		//2.
		
		driver.navigate().to(url);
	   //1.this will keep history
		//2.it does not wait for the webpage to load
		
		Thread.sleep(5000);
		driver.manage().window().maximize(); // this will make the browser window full screen
		Thread.sleep(5000);
		
		driver.manage().window().minimize(); // this will minimize the window
		Thread.sleep(3000);
		
		driver.manage().window().maximize(); //will maximize again
		
		Thread.sleep(null);
		
		driver.navigate().to("https://github.com/");
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://maven.apache.org/");
		
		Thread.sleep(3000);
		
		driver.navigate().back(); // go one step back (github)
		
		Thread.sleep(3000);
		
		driver.navigate().back(); // to one more step back(selenium)
		
		Thread.sleep(3000);
		
		driver.navigate().forward(); // one spet forward(github)
		
		
		
		
		
		
		driver.quit();
	}

}
