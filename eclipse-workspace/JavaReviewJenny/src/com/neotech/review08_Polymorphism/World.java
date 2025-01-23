package com.neotech.review08_Polymorphism;

public class World {

	public static void main(String[] args) {
		
		Human.planet="Earth";
		
		Human h1=new Human();
		h1.name="Hazal";
		System.out.println(h1.name+ " lives on "+Human.planet);
		
		
		Human h2=new Human("Priya");
		System.out.println(h2.name+ " lives on "+Human.planet);
		
		System.out.println("---------");
		
		Human.planet="Mars";
		System.out.println(h2.name+ " lives on "+Human.planet);
		System.out.println(h1.name+ " lives on "+Human.planet);
		
		//Declaring a variable of type Human
		Human h3;
		
		//creating an Albanian and assigning to h3
		h3=new Albanian("Irena"); //up-casting (creating a specific object and you're storing it as a parent)
		System.out.println(h3.name+ " lives on "+Human.planet);
		
		Human h4=new Turkish("Asli"); //up-casting automatically
		
		System.out.println("--------");
		System.out.println("Let's make people talk by giving money");
		
		h1.talk();
		h2.talk();
		h3.talk();
		h4.talk();
		
		Turkish t1=(Turkish) h4; //Down-casting
		t1.talk();
		t1.makeBaklava();
		
	//	Turkish t2= (Turkish)h3;
	//	t2.makeBaklava();           this will give a runtime error
	}
}
