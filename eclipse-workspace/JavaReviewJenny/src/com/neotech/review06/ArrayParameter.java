package com.neotech.review06;

import java.util.Arrays;

public class ArrayParameter {
	public static void main(String[] args) {
		
		int[] array= {3,5,2,1,6};
		System.out.println(array[1]);
		
		String str=Arrays.toString(array);
		
		System.out.println(str);
		
		ArrayParameter ap=new ArrayParameter();
		int result=ap.largestNumber(array);
		System.out.println("The largest number in the array is "+result);
		
		
	}
	//input-->int[](an array of numbers)
	//logic-->given an array, find the largest number
	//output-->int (the largest number of an array)
	//visibility-->public(access from everywhere)
	//usage-->non-static(You need an object to execute the method)
	public int largestNumber(int[]arr) {
		int largest=arr[0];
		
		for(int el:arr) {
			if (el>largest) {
				largest=el;
			}
			
		}
		return largest;
		
	
		
	}


}