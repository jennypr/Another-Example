package com.neotech.officehour01;

public class DataTypeVariableRecap {

	public static void main(String[] args) {
		
		System.out.println(10); // int literal
		
		// We also have variables
	   // 8 primitive data types that define variables
		
		int age; // I declare that I have an int variable
		age=30; // I assign a value to age variable
		
		System.out.println("Age-->"+ age); 
		
		// Cannot I just print 
		
		System.out.println("Age-->"+ 30); 
		
		//What happens if I change the variable value --> Re-assign
		age =31;
		
		System.out.println("Age-->"+ age); // This is a variable we can change it / Variable holds a memory
		System.out.println("Age-->"+ 29); // This is hard-coding
		
		char c = '^'; // always enclosed by single quotes
		System.out.println(c);
		
		// Let's define some decimal number
		
		double num1=10;
		double num2=3;
	
		
		System.out.println(num1);
		
		System.out.println("num1/num2="+ num1/num2);
		
		// How about if we divide 10/3 directly?
		
		System.out.println("10/3=" + 10/3); 
		
		// Let's take an example on module
		// 10/3 as int division= 3 -> what's the remainder?
		//-> 10-3*3 = 10-9=1 (the remainder is 1)
		// Which is 10%3=1
		System.out.println("10%3="+ 10%3);
		
		// Another example
		//-> 5/2 = 2
		// What is remainder of the division?
		//-> 2*2=4
		//To get the remainder , we subtract 4 from 5-> 5-4 = 1
		
		// You can think of it this way
		// Let's take the double - division
		//->5.0/2.0=2.5
		//-->Take the mantissa( decimal part) and multiply by 2
		//-->0.5 *2 =1 which is the remainder of the division
		
		System.out.println("5%2="+ 5%2);
		
		
		
		
		
		
		
		

	}

}
