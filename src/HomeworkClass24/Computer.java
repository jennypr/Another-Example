package HomeworkClass24;

public class Computer {
	/*Homework: 
	    ▪ Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
	    ▪ Define some common behavior (methods) and some fields in the parent class,
	     and override some of the methods in the child classes.
	    ▪ Define some methods specific to the child classes.
        ▪ Create objects of the child classes and store them in an array.
        ▪ Loop through each object and execute available methods.
	     */
	
	String brand;
	
	//If we want to force the user to assign a value to brand while creating an object
	//the we should create a parameterized constructor that received brand and assigns
	//its value
	
	public Computer(String brand) 
	{
		this.brand=brand;
	}
	
	public void run() 
	{
		System.out.println(brand+" can run the system!");
	}
	
	}

class Apple extends Computer 
{

	public Apple(String brand) {
		super(brand);
		
	}
	
	//Overriding the run method
	public void run() 
	{
		System.out.println(brand+" runs the system faster");
	}
	
	public void safe() 
	{
		System.out.println(brand+" is very safe!");
	}
	
}

class Lenovo extends Computer
{

	 Lenovo(String brand) 
	    {
		super(brand);
		}
	 
	 public void safe() 
		{
			System.out.println(brand+" computers run even faster!");
		}
	 
	 public void save() 
	 {
		System.out.println(brand+" has a lot of memory"); 
	 }
	
}

class HP extends Computer
   {
      String color;
      
      HP(String brand,String color)
      {
    	  super(brand);
    	  this.color=color;
      }
      
      public void safe() 
  	{
  		System.out.println(brand+" computers run slowly!");
  	}
      
      public void save() 
      {
    	  System.out.println(brand+" computers do not have big storage");
      }
	
	}

class Dell extends Computer{

	public Dell(String brand) 
	{
		super(brand);
		
	}
	
}
	

