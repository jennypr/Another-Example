package com.neotech.review03;

public class ForLoopDemo {
	public static void main(String[] args) {
		
		//I want to celebrate my son't birthday from 11 to 20 (use for loop)
		//but not 13th birthday, because we're scared
		
		//1st iteration->initialization; 2.check the condition
		//Next iterations->1.incrementing; 2. check the condition
		
		for(int age=11; age<=20; age++ )
			
		{
			if (age==13) {
				continue;
			}
			System.out.println("Happy birthday! You are "+age+ " years old!");
			
		}
		
		
		
	}

}
