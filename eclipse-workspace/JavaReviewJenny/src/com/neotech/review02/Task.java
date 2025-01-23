package com.neotech.review02;

import java.util.Scanner;

public class Task {
	//Ask the user to a enter a positive number and add it to the total

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int num =0;
		int total = 0;
		
		/*
		 * System.out.println("please enter a positive number! to STOp enter -1");
		 * 
		 * num = scan.nextInt();
		 * 
		 * while (num !=-1) { total+=num;
		 * 
		 * System.out.println("please enter a positive number! to STOp enter -1");
		 * num=scan.nextInt();
		 * 
		 * 
		 * 
		 * }
		 * 
		 * System.out.println("Total="+ total);
		 */
		
		do {
			System.out.println("please enter a positive number! to STOp enter -1");
			
		} while( num!=-1);
		
		System.out.println("Total="+ total);
		
		

	}

}
