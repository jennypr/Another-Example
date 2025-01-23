package com.neotech.review07;

public class Doctor {
	
	String name;
	int salary;
	String licenseId;
	
	//it's a good practice to declare the default constructor
	Doctor(){
		
	}
	
	Doctor (String name,int salary,String licenceId)
	{
		this.name=name;
		this.salary=salary;
		this.licenseId=licenseId;
	
	}
	
	public void checkUp(String patientName) 
	{
		System.out.println("Doctor "+name+" makes a check up on "+patientName+".");
	}
	

}
