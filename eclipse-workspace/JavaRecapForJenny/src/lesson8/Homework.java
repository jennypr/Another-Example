package lesson8;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

//Allow user to enter grade and then provide explanation:
//A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
//At the end your program should print which grade was entered by the user with explanation.
//	
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter your grade: ");
	char grade = input.next().charAt(0);
	
	switch (grade) 
	{
	case 'A' :
	case 'a':  // to include lower case too
		System.out.println("A-excellent");
		break;
		
	case 'B' :
	case 'b':
		System.out.println("B-Good");
		break;
		
	case 'C' :
	case 'c' :
		System.out.println("C-Average");
		break;
		
	case 'D' :
	case 'd':
		System.out.println("D-Bad");
		break;
		
		default :
			System.out.println("Not Acceptable");
			break; // not necessary here
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
