package com.neotech.review02;

import com.neotech.utils.BaseClass;

public class CheckBoxDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		setUp();
		
		Thread.sleep(2000);
		
		//cannot click on input because the label doesn't allow
		//driver.findElement(By.id("gender-radio-2")).click();
		
		
		
		tearDown();
		
	}

}
