package lesson8;

import java.util.Scanner;

public class IntroToWhileLoop {

	public static void main(String[] args) {
		 
		int num =1;

		
		while (num <11) 
		{               
			System.out.print(num+ " ");
			num++;
		}
		
		System.out.println();  // to get the displays separated, we insert a new line

 
		num=2;
		
		//2nd way of same display
		while (num <11) 
		{
			System.out.println(num++ +" "); // display num the increment it
		}
		
		System.out.println();
		
		//How can I enter 5 numbers from the console using while loop
		
		int var;
		Scanner scan = new Scanner (System.in);
		int count = 2;
		
		while(count > 0)
		{
			System.out.println("Enter a number");
			var=scan.nextInt();
			System.out.println(var);
			count--;
		}
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
