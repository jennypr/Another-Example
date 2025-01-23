package com.neotech.lesson8;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		// Find the largest among three different numbers
		// Let the user to enter these numbers
		
		Scanner scan = new Scanner (System.in);
		double a,b,c;
		
		// prompt the user to enter these three numbers
		
		System.out.println("Enter three different numbers: ");
		a = scan.nextDouble();
		b= scan.nextDouble();
		c=scan.nextDouble();
		
		if (a>b) // a>b --> true
		{
			if (a>c) // a>c-->true-->a>b and a>c
			{
				System.out.println(a +" is the largest number!");
			}
			else // a<c--> true-->a>b and c >a --> c is the largest
			{
				System.out.println(c+ " is the largest number!");
			}
			
			}
			
		else // b>a
		{
			if(b>c)
			{
				System.out.println(b+ " is the largest number!");
			}
			
			else 
			{
				System.out.println(c+ " is the largest number!");
			}
			
		}
		
		
		

	}

}
