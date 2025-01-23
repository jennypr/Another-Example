package com.neotech.review07;

public class Person {
	
	String name;
	int age,weight;
	
	Person (String name,int age,int weight)
	{
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	
	void displayInfo()
	{
	System.out.println("Name: "+name+" age: "+age+ " weight: "+weight);	
	}
	
public static void main(String[] args) {
	
	Person p1=new Person("Jenny",30,115);
	p1.displayInfo();
	
	
	
}
}
