package com.neotech.review07;

public class HospitalApplication {
	
	public static void main(String[] args) {
		
		Doctor d1=new Doctor("Natalia",150000,"RU195");
		d1.checkUp("Secil");
		
		Dermatologist d2=new Dermatologist();
		d2.name="Bello";
		d2.salary=170000;
		d2.licenseId="NG412";
		d2.dermId="D948";
		d2.checkUp("Jenny");
		d2.applySkinTreatment();
		
		System.out.println("-----------");
		
		Dermatologist d3=new Dermatologist("Cadet", 200000, "HT732", "D007");
		d3.checkUp("May");
		d3.applySkinTreatment();
	
		
	}

}
