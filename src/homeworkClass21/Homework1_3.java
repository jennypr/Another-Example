package homeworkClass21;

public class Homework1_3 extends Homework1_2{
	
	public void class3() 
	{
		System.out.println("This is class 3");
	}
	
	public static void main(String[] args) {
		
		Homework1 hw=new Homework1();
		hw.class1();
		
		Homework1_2 hw2 =new Homework1_2();
		hw2.class1();
		hw2.class2();
		
		Homework1_3 hw3=new Homework1_3();
		hw3.class1();
		hw3.class2();
		hw3.class3();
	}

}
