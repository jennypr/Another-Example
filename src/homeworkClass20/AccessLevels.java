package homeworkClass20;

public class AccessLevels {
	

/*Homework 2:
  Write a program that will have 4 different access 
  levels of constructors and create 3 objects of this class: 
  1 -inside same class; 2 -from outside the class; 
  3 -from different class inside different package and observe result. */
	
	
	public AccessLevels(String name) 
	{
		
		System.out.println("Name: "+name +" is a public access level");
		
	}
	
	 AccessLevels(String lastName,String age)
	{
		System.out.println("The last name: "+lastName +" the age: "+age +" are default access level");
	}
	 
	 protected AccessLevels(String address ,int num) {
		 
		System.out.println("The adress and zip code : "+"are protected access level");
		 
	 }
	 
	 private AccessLevels(int ssn) 
	 {
		 System.out.println("The ssn# "+ssn+" is private access level");
		 
	 }
	 
	 public static void main(String[] args) {
		 
		 AccessLevels obj1=new AccessLevels("Jenny");
		 AccessLevels obj2= new AccessLevels("Porja",30);
		 AccessLevels obj3= new AccessLevels("Quenns",11102);
		 AccessLevels obj4= new AccessLevels(3085976);
		 
		
	}

}
