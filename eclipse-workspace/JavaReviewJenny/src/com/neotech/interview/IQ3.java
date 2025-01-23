package com.neotech.interview;

import java.util.Arrays;

public class IQ3 {
	
	//Write a Java Program to print the first 10 numbers of Fibonacci series.

	public static void main(String[] args) {
		// silly way
		System.out.println("1,1,2,3,5,8,13,21,34,55...");

		//1st way
		
		int num1=1;
		int num2=1;
		int next;
		
		for(int i=1; i<=20; i++) {
			System.out.print(num1+",");
			next=num1+num2; //Find the next number 
			num1=num2; //shift num1
			num2=next; //shift num2
		}
		
		//2nd way
		int a=1;
		int b=1;
		
		for(int i=1; i<=20; i++) 
		{   System.out.print(a+',');
		    //shifting b
		    b=b+a;
		    a=b-a;
		 }
		System.out.println("\n------------");
		//3rd way
		 int[] arr=new int[10];
		 arr[0]=1;
		 arr[1]=1;
		 
		 for(int i=2; i<arr.length; i++) 
		 {
			 arr[i]=arr[i-1]+arr[i-2];
		 }
		 
		 System.out.println(Arrays.toString(arr));
		 
		 
	}  

}
