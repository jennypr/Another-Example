package com.neotech.interview;

public class IQ1 {

	public static void main(String[] args) {
	//	Write a program to swap 2 numbers without a temporary variable? Swap 2 strings
	//			without a temporary variable?
		
		int a=8;
		int b=3;
		
		System.out.println("a="+a+" b="+b);
		
		//using a temporary variable
		//int temp=a;
		//a=b;
		//b=temp;
		
		a=a+b; //a=11 b=3
		b=a-b; 
		
		System.out.println("a="+a+" b="+b);

	}

}
