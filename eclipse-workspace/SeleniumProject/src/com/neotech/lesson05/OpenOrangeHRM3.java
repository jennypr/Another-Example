package com.neotech.lesson05;

import com.neotech.utils.BaseClass;

public class OpenOrangeHRM3 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// set up the environment for testing
		
		setUp();
		
		//Write your test cases
		
		String title=driver.getTitle();
		System.out.println(title);
		
		
		Thread.sleep(null);

		//Close the browser
		
		tearDown();
	}

}
