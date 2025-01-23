package com.neotech.review12;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		
		division(9,3);
		division(10,0);
		division(8,4);
		
		
	}
	
	public static void division(int num1,int num2) {
		
		try {
		int result=num1/num2;
		
		System.out.println("The result is-->"+result);
		} catch (Exception e) {
			
			System.out.println("Exception->"+e);
			System.out.println("Exception Message->"+e.getMessage());
		} finally {
			System.out.println("NeoTech is the best!!!");
		}
		
		
	}

}
