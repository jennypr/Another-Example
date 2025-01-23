package com.neotech.review01;

import java.util.Scanner;

public class ScannerReview {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // insert scanner with cmd + shit + o
		
		// .next reads one word until space/enter
		System.out.println("Please enter your first name: ");
		String firstName = scan.next();
		
		System.out.println("Your first name is "+ firstName);
		
		System.out.println("Please enter your last name: ");
		String lastName = scan.next();
		
		System.out.println("Your last name is "+ lastName);
		
		System.out.println("---------------------"); 
		// . nextLine(); reads the whole line until enter 
		
		System.out.println("Please enter your first name: ");
		String firstName1 = scan.nextLine();
		
		System.out.println("Please enter your last name: ");
		String lastName1 = scan.nextLine();
		
		System.out.println("Your first name is "+ firstName1 + " and your last name is "+ lastName1);
		
 	System.out.println("Please enter an int, boolean and double ");
		int num= scan.nextInt();
		boolean b = scan.nextBoolean();
		double d = scan.nextDouble();
		
		System.out.println("You entered: "+ num+ " "+ b + " "+ d);
		
		
		
		
		

	}

}
