package com.neotech.review07;

public class Dermatologist extends Doctor{
	
	public Dermatologist() {
		super();   //the default super constructor is being implicitly called
	}
	
	String dermId;
		// the constructors cannot be inherited
	
	Dermatologist(String name,int salary,String licenceId,String dermID) 
	{
		super(name, salary, licenceId);
		//super.name=name;
		//super.salary=salary;
		//super.licenseId=licenceId;
		this.dermId=dermID;
	}
		
	public void applySkinTreatment() 
		
	{
			System.out.println("Doctor "+name+" applies skin treatment.");
		
	}
		
		
	

}
