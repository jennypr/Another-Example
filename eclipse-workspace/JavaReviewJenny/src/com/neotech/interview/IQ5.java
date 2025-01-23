package com.neotech.interview;

public class IQ5 {
	
	//Write a java program to reverse a String? Reverse a string word by word?

	public static void main(String[] args) {
		 String str="Neotech";
		 
		 //1st way
		 System.out.println("The reverse string-> "+reverseOne(str));
		 
	}

	public static String reverseOne(String str) {
		//1st way, using charAt() method
		
		String reverse="";
		
		//Starting from the last character down the first one
		for(int i=str.length()-1; i>=0; i--) {
			reverse+=str.charAt(i);
		}
		
		return reverse;
	}
}
