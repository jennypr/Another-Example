package lesson9;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// Ask user to guess the number
		// Lucky number is 5
		
		int luckyNumber=5;
		int userGuess;
		
		Scanner scan= new Scanner(System.in);
		
		//using while loop
		
		System.out.println("Guess my lucky number: ");
		userGuess=scan.nextInt();
		
		while( userGuess!=luckyNumber) 
		{
			System.out.println("No,try again");
			userGuess=scan.nextInt();
		}
		
		System.out.println("You got it");
		

		
		scan.close();
	}

}
