package lesson8;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double a,b,c;
		
		// Let's prompt the user to enter these 3 numbers
		System.out.println("Enter three different numbers:");
		a=scan.nextDouble();
		b=scan.nextDouble();
		c=scan.nextDouble();
		
		if (a>b) 
		   {
			if (a>c) {
				System.out.println(a+ " is the largest number.");
			}
			else 
			{
				System.out.println(c+" is the largest number.");
			}
		}
		else 
		{
			if(b>c) {
				System.out.println(b + " is the largest number.");
			}

			else {
				System.out.println(c +" is the largest number.");
			}
		}
		
		//2nd way
		
		if (a>b && a<c) {
			System.out.println(a+" is the largest number.");
		}
		else if(b>a && b>c) {
			System.out.println(b+" is the largest number.");
		}
		else {
		System.out.println(c+ " is the largest number.");
		}
		
		
		

	}

}
