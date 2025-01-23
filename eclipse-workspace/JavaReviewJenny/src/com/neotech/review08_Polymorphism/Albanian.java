package com.neotech.review08_Polymorphism;

public class Albanian extends Human {
	
	public Albanian() {
		
	}
	
	public Albanian(String name) 
	{
		super(name);
	}
	
	@Override 
	public void talk() 
	{
		System.out.println("Une flas shqip. Une quhem "+name);
	}
	
	public void albanianDance() 
	{
		System.out.println(name+" is dancing valle Kosovare!");
	}

}
