package HomeworkClass24;

public class ComputerTest {

	public static void main(String[] args) 
	{
		Apple app1=new Apple("Apple");
		HP hp1=new HP("Hp","Black");
		
		//arrays can only hold elements of the same type
		int[] arr= {1,2,3,4,5};
		
		Computer c1=new Dell("Dell");
		Computer c2=new Lenovo("Lenovo");
		
		//1st way for creating an array of objects
		
		Computer[] compArray= {c1,c2};
		
		//2nd way
		Computer[] compArray2= {new Apple("Apple"), new Dell("Dell"),
				new HP("HP","Black"),new Lenovo("Lenovo")};
		
		for(Computer comp: compArray2)
		{
			System.out.println("The brand is "+comp.brand);
			comp.run();
		
		// these methods do not exist in Computer, so we can't access them here
		//	comp.save(); -->not accessible
       //	comp.safe(); -->not accessible
		}
	}

}
