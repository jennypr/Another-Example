package com.neotech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	
	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.neotechacademy.com/");
        Thread.sleep(5000); // 5000 milliseconds = 5 seconds
        driver.quit();
}
	

}
