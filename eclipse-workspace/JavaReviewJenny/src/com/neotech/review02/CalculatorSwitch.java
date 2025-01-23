package com.neotech.review02;

import java.util.Scanner;

public class CalculatorSwitch {
	
	// Ask the user to enter 2 numbers
			// Ask the user for the operator (+,-,*,/)
			//Calculate the result using if else

	public static void main(String[] args) {
		
		Scanner everest=new Scanner(System.in);
		
		System.out.println("Please enter the first number: ");
		double d1= everest.nextDouble();
		
		System.out.println("Please enter the second number: ");
		double d2=everest.nextDouble();
		
		System.out.println("Please enter operator (+,-,*,/)");
		String operator = everest.next();
		
		double result=0;
		
		switch (operator) 
		{
		case "+" :
			result= d1+d2 ;
			break;
			
		case "-" :
			result=d1-d2;
			break;
			
		case "*":
			result= d1*d2;
			break;
			
		case "/" :
			result=d1/d2;
			break;
			
			default :
				System.out.println("Invalid operator");
			}
		
		
		
		if (operator== "+" || operator == "-" || operator == "*" || operator == "/")
		{
		System.out.println("The result is: "+result);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
