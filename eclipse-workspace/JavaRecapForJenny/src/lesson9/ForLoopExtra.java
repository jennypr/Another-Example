package lesson9;

public class ForLoopExtra {

	public static void main(String[] args) {
		System.out.println("Print the numbers from 21 to 30");

		for(int i=21; i<=30; i++) 
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\nPrint the even numbers from 20 to 1");
		
		for(int i=20; i>=1; i-=2) {
			System.out.print(i+" ");
			
		}
		
		System.out.println();
		for (int i =1; i<=10; i+=2) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n\nCalculate the sum of ODD numbers from 1 to 10");
		
		int sum=0;
		for(int i=1; i<=10; i++) 
		{
			if(i%2==1) 
			{
				sum+=i;
			}
			
			System.out.println("Sum is "+sum);
			
		}
		
		
		
	}

}
