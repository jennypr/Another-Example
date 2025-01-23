package com.neotech.review06;

public class FamilyMember {
	
	String firstName;
	static String lastName;
	int age;

	void printFullName() 
	{
		System.out.println("Full name is: "+firstName+" " +lastName);
	}
	
	static void printFamilyName(){
		
		System.out.println("Family name is: "+lastName);
		
	}
	
	

}
