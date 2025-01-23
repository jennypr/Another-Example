package lesson10;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// 2. Write a program that asks the user to enter his/her username 
		//and password until the user enters them correctly.
		
		//The following are the expected credentials
		String expectedUsername= "user";
		String expectedPassword ="password";
		
		Scanner scan = new Scanner(System.in);
		
		//The user entered username and password
		String username , password;
		
		do 
		{
		  System.out.println("Enter the username and password:");	
		  username=scan.next();
		  password=scan.next();
		  
		  //Check if the entered credentials are valid
		if(expectedUsername.equals(username) && expectedPassword.equals(password)) {
			//Display a message and enter the loop
			
			System.out.println("You're successfully logged in!!!");
			break;
			
		}
			
		} while(true);
		
		
		//2nd way
		
		boolean flag=true;
		do 
		{
		  System.out.println("Enter the username and password:");	
		  username=scan.next();
		  password=scan.next();
		  
		  //Check if the entered credentials are valid
		if(expectedUsername.equals(username) && expectedPassword.equals(password)) {
			//Display a message and enter the loop
			
			System.out.println("You're successfully logged in!!!");
			flag=false;
			
		}
			
		} while(flag);
		
		
		
		

	}

}
