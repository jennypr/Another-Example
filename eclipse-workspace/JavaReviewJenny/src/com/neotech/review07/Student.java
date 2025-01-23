package com.neotech.review07;

public class Student {
	
	//instant/object variables
	
	String name;
	int age;
	
	//static/class variables
	static String school;
	
	public Student(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public void displayStudentInfo()
	{
		System.out.println("My name is: "+ this.name+ " and my age is: "+this.age+" and my school is: "+school);
	}
	
	
	//static/class method
	public static void main(String[] args) {
		
		school="Neotech";
		
		// Student.name="Yasmin";
		// cannot be used without an object
		
		
		//Student s1=new Student();
		//cannot do this because we don't have a default constructor
	}
	
	

	
}
