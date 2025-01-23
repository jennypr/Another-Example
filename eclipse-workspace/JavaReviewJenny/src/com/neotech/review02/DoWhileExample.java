package com.neotech.review02;

public class DoWhileExample {

	public static void main(String[] args) {
		
		System.out.println("Similarities between WHILE & Do-WHILE");
		
		int age=1;
		while (age <=10) {
			System.out.println("happy birthday! You are "+age+ " years old!");
			age++; 
			 
			
		}
		
		int age2 = 1;
		do {System.out.println("happy birthday! You are "+age2+ " years old!");
		age2++;
			
		}while (age2 <=10);
		
		
		boolean hot =true;
		
		while(!hot) {
			System.out.println("While loop->Drink!");
		}
		do {
			System.out.println("DO-While loop->Drink!");
			
		} while (!hot);
		

	}

}
