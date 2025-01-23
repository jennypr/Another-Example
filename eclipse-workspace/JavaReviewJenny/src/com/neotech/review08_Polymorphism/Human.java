package com.neotech.review08_Polymorphism;

//every class by default extends the object class
public class Human {
	
	//fields/variables of this class
	String name; //instance variables
	  //class or static variables
	public static String planet;
	
	public Human()  //if we don't declare constructor Java will make one by default
	{
		// super();  //if we are not extending any classes, Java by default extends object class
		System.out.println("A human is being created...");
	}  
	
	public Human(String name) {
		
		super();
		this.name=name;
	}
	
	//behavior/method
	public void talk() {
		System.out.println("bla bla bla");
	}

}
