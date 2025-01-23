package com.neotech.review05;

public class World {

	public static void main(String[] args) {
		
		Baby baby1=new Baby();
		
		baby1.name="Jenny";
		baby1.gender='F';
		baby1.weight= 7;
		baby1.hairColor="Brown";
		
		System.out.println("The name of baby1 is->" +baby1.name);
		
		Baby baby2=new Baby ();
		baby2.name="May";
		baby2.gender='F';
		baby2.weight=4;
		baby2.hairColor="Brown";
		
		System.out.println("The name of baby2 is->" +baby2.name);
		
		baby1.cry();
		baby2.cry();
		
		baby1.talk();
		
		baby1.DisplayInformation();

		
		
		
		

	}

}
