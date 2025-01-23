package com.neotech.review12;

public class CheckedExceptionDemo2 {

	public static void main(String[] args) {
		
		System.out.println("Hi Java!");
		
		try {
			Thread.sleep(3000);// waiting for 3000ms =3seconds 
		} catch (InterruptedException e) {
			System.out.println("Something went wrong while sleeping");			
		} 
		
		System.out.println("Bye Java!");
	}

}
