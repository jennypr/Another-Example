package com.neotech.review01;

public class TypeCAsting {

	public static void main(String[] args) {
		//byte < short<int<long<float<double
		int intNumber=73;
		
		//widening -> implicit casting / automatically 
		double doubleNumber = intNumber;
		
		
		//narrowing / explicit casting
 		
	     //re-assign
		intNumber = 830;
		
		// in this case we will lose data
		byte b2= (byte ) intNumber ;
		System.out.println("b2 -> "+ b2); 
		
		
		// widening / implicit casting / automatically
		byte b3 = 40;
		int i3 = b3;
		System.out.println("i3-> "+i3);
		
		//narrowing / explicit casting / manually
		
		double d1=6.4;
		int i4 = (int) d1;
		System.out.println("i4 -> "+ i4);
		
				

	}

}
