package com.neotech.review09;

public class PhoneDemo {

	public static void main(String[] args) {
		
		Phone p=new Phone("S23545", "Samsung", "Pass@123");
		p.displayInfo();
		
	//	p.password(); --> cannot access it from this class , because it private
		
		//Getters and Setters
		
		String serial=p.getSerialNumber("Pass@123");
		System.out.println("The serial number is -> "+serial);
		
		p.setSerialNumber("S999");
		p.displayInfo(); 
		
		p.setSerialNumber("Trump@1");
		p.displayInfo();
		
		p.getBrand();
		p.displayInfo();
		
		
		

			
		
		}
				
		
				
				
				
				
	}


