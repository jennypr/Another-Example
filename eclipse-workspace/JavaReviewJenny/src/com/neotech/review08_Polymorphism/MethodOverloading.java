package com.neotech.review08_Polymorphism;

public class MethodOverloading {
	
	//method signature=method name + parameters
	//access modifier is not part of Method signature
	//Return type is NOT part of the Method signature
	//Static or non static is NOT part of me the method signature
	
	public void calculateInterest() 
	{
		
	}
	
	public void calculateInterest(int a) 
	{
		
	}
	
	public void calculateInterest(String a) 
	{
		
	}
	
	public void calculateInterest(double a) 
	{
		
	}
	
	public static void main(String[] args) {
		
		MethodOverloading mo=new MethodOverloading();
		mo.calculateInterest("Jenny"); 
		mo.calculateInterest();
		
		//Polymorphism
		//Method Overloading
		//Compile Time Polymorphism /early binding/static binding
		
	}

}

