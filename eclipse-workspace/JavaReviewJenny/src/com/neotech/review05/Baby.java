package com.neotech.review05;

public class Baby {
	
	
	//variables /attributes/properties of the class "baby"
	String name;
	char gender;
	int weight;
	String hairColor;
	
	//methods/behaviors/actions
	
	void talk() 
	{
		System.out.println(name+" is talking");
	}
	
	void cry() 
	{
		System.out.println(name+" is crying");
	}
	
	void eat() 
	{
		System.out.println(name+" is eating");
	}
	
	void DisplayInformation() {
		System.out.println("My name is "+name);
		System.out.println("My gender is "+gender);
		System.out.println("My weight is "+weight);
		System.out.println("My hair color is "+hairColor);
	}
	
	
	
	

}
