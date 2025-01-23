package com.neotech.review08_Polymorphism;

public class Turkish extends Human{
	
	public Turkish(String name) {
		super(name);
	}
	
	public void talk() 
	{
		System.out.println("Ben turkce konusuyorum.Benim adim "+name);
	}
	
	public void makeBaklava() 
	{
		System.out.println(name+" is making baklava!");
	}
	
	

}
