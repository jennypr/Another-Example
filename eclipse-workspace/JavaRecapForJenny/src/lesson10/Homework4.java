package lesson10;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
	
		/*4. Create a program that will be asking the user to apply for a credit card 10 times.
		As soon you get a "yes" from the user program should stop asking.*/
		
		Scanner scan= new Scanner(System.in);
		String answer;
		
		for (int i=1; i<=10; i++) 
		{
			System.out.println("Do you want to apply for a credit card?Yes/No:");
			answer=scan.next();
			
			if (answer.equalsIgnoreCase("yes"))		{
				break;
			}
			
		}
		
		
		
	
		
	}

}
