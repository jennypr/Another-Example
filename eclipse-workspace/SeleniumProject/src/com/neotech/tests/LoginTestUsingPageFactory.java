package com.neotech.tests;

import com.neotech.pages.DashboardPageUsingPageFactory;
import com.neotech.pages.LoginPageUsingPageFactory;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTestUsingPageFactory extends CommonMethods {
	// https://hrm.neotechacademy.com/
	
	public static void main(String[] args) {
		
		setUp();
		
		LoginPageUsingPageFactory login= new LoginPageUsingPageFactory();
		
		//sending the username
		sendText(login.username, ConfigsReader.getProperty("username"));
		
		//sending ther password
		sendText(login.username, ConfigsReader.getProperty("password"));
		
		click(login.loginBtn);
		
		wait(3);
		
		DashboardPageUsingPageFactory dashboard = new DashboardPageUsingPageFactory();
		
		
		
		//validate if the logo is displayed
		
		if(dashboard.logo.isDisplayed()) {
			System.out.println("Test passed!");
		}
		else {
			System.out.println("Test failed");
		}
		
		//validate the account name
		String expectedName="Jacqueline White";
		String actualName= dashboard.accountName.getText();
		
		if(actualName.equals(expectedName)) {
			System.out.println(expectedName+ " is logged in!");
		}
		else {
			System.out.println(expectedName+ " is not logged in!");
		}
		
		wait(2);
		
		
		
		
		
		
		
		tearDown();
		
		
		
	}

}
