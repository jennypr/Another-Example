package com.neotech.review05;

public class Methods {
	
	void sayWelcome() {
		for( int i = 0; i<=5; i++) {
			
			System.out.println("Welcome");
			
		}
			System.out.println("Welcome");
	}
	
	void sayWelcomeWithNumber(int n) {
		for (int i=0; i<=n; i++) {
			System.out.println("Welcome");
			
		}
	}
	
	void sayGreeting(String greeting, int number) {
		for(int i=0; i<number; i++) {
			System.out.println(greeting);
		}
	}

	public static void main(String[] args) {
		Methods meth=new Methods();
		
		meth.sayWelcome();
		
		System.out.println("--------");
		
		meth.sayWelcomeWithNumber(7);
		
		meth.sayGreeting("Ciao", 3);
		
		
	}

}
