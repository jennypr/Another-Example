package com.neotech.review12;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		
		int[] numbers=new int[3];
		
		
		try {
		for (int i=0; i<=3;i++) 
		{
		numbers[i]=i;
	    }
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		System.out.println(e.getMessage());
		e.printStackTrace();
		
	//	print meaningful message
		System.out.println("Error:You are storing an element outside of the array!");
		
	}
		
		System.out.println("Continue code execution...");
		
		
	}
}
