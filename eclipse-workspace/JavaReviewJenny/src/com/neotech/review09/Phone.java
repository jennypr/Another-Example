package com.neotech.review09;

public class Phone {
	
	private String serialNumber;
	private String brand;
	private String password;
	
	public Phone(String serialNumber,String brand ,String password) {
		this.serialNumber=serialNumber;
		this.brand=brand;
		this.password=password;
	}
	
	public void displayInfo() {
		System.out.println("This is a "+brand+" "+"phone with serial number "+serialNumber);
	}
	
	
    //this method will return the serialNumber only if you provide the right password
	public String getSerialNumber(String password) {
		if(this.password.equals(password)) {
			return serialNumber;
		} else {
			return "Access denied";
		}
		
	}
	//This method will change/reassign the serialNumber
	//Only if it is 7 character long
	public void setSerialNumber(String serialNumber) {
		if(serialNumber.length()==7) {
			this.serialNumber=serialNumber;
		}
		
		
		}
	public String getBrand() {
		return this.brand;
}
	
	
	
	
	
	
	
}