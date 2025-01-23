package com.neotech.interview;

public class IQ2 {
	
	//Write a java program to check whether a given number is prime or not?
	  // a prime number is a number that is greater than 1
	  //Number 1 is NOT prime
	  // Prime number is divisible by only 1 and itself

	public static void main(String[] args) {
		
		int number = 7; //Not prime, divisible by 1,5,7,35
		
		boolean prime=true;
		
		if(number<=1) {
			prime=false;
		} else {
			
			for( int i=2; i<number; i++) {
				if (number % i==0) {
					System.out.println(number+" is divisible by "+i);
				} else{
					System.out.println(number+" is NOT divisible by "+i);
				}
			}
			 
		}
		
		System.out.println("---------------");
		System.out.println(number+" is prime? "+prime);
	}

}
