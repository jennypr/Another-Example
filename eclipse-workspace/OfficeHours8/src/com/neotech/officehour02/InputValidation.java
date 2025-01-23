package com.neotech.officehour02;

import java.util.Scanner;

public class InputValidation {

	public static void main(String[] args) {
		
		double score;
		Scanner scan=new Scanner (System.in);
		
		do 
		{
			System.out.println("Enter a score between 0 and 100: ");
			score=scan.nextDouble();
			
			if (score<0 || score >100) {
				System.out.println("Invalid score, please enter the score again:");
				continue;
			}
			
			else
			{
				System.out.println("The score is: "+score);
				break;
			}
			
		} while(true);
		
			
		
		
		
	}
}
