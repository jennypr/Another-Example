package homeworkClass20;

public class Student {
	/*	Homework 1:
	    Write program as a Student class that has instance variables 
	    name and address. Create a constructor that will initialize those variables. 
	    Print name & address of given student using displayInfo method. */
	
	
	String name,address;
	
	Student(String name, String address) {
		this.name=name;
		this.address=address;
	}
	
	public void displayInfo() {
		System.out.println("Name: "+this.name+" ,adress: "+this.address);
	}
	
	public static void main(String[] args) {
		
		Student st1=new Student("Jenny", "Queens,NY");
		st1.displayInfo();
		
		
	}

	
}
