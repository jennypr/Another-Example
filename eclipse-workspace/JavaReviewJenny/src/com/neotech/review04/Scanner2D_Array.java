package com.neotech.review04;

import java.util.Scanner;

public class Scanner2D_Array{

	public static void main(String[] args) {
		/* Ask the user :How many row do you want in the array?
		 * Ask the user:How many columns do you want in the array?
		 * Create the array(String[] names)
		 * Fill the array
		 * Print the array
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("How many row do you want in the array?");
		
		int rows= scan.nextInt();
		
		System.out.println("How many columns do you want in the array?");
		
		int col=scan.nextInt();
		
		String [][] names=new String [rows][col];
		
		for(int i =0; i<rows; i++) {
			for(int j=0; j<col; j++) {
				System.out.println("Please enter a name: ");
			    names[i][j]=scan.next();
				
			}
			
		}
		
		// Print the array
		//use enhances/advanced for loop
		
		
		for (String [] row:names) 
		{
			for(String name:row) {
				System.out.println(name+" ");
				
			}System.out.println();
		}
		
		

	}

}
