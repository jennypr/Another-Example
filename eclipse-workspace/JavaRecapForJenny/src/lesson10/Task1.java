package lesson10;

public class Task1 {

	public static void main(String[] args) {
		// Printed the following pattern using a nested for loop
		//1
		//22
		//333
		//4444
		//55555
		
		for(int i=1; i<=5; i++)
		{
			//the inner loop should display
			//1st row: 1
			//2nd row: 22
			  //...
			
			for (int j=0; j<i; j++) {
				System.out.print(i);
			}System.out.println();
		}

	}

}
