package com.neotech.review05;

public class MethodWithReturn {

	public static void main(String[] args) {
		String name="Carolina";
		
		int numOfChars=name.length();
		System.out.println("The number of the string is "+numOfChars);
		
		MethodWithReturn m=new MethodWithReturn();
		boolean res=m.isOdd(4);
		System.out.println("Is it odd? "+res);
		
		boolean res3=m.isOddEnhanced(5);
		System.out.println(res3);
		

	}
	
	boolean isOddEnhanced(int num) {
		return num%2==1;
		}
	
	
	
	boolean isOdd(int num) {
		
	boolean result;
		if (num%2==1) {
			result=true;
		}else {
			result=false;
		}
		return result;
		
		}

}
