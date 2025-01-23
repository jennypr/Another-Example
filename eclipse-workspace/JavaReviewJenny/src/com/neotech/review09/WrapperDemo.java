package com.neotech.review09;

public class WrapperDemo {

	public static void main(String[] args) {
		
		
		int num1=23;
		
	//	Integer integer1=new Integer(20); //until Java 1.8
	//	Integer integer2=Integer.valueOf(20); //java 9 and up
		
		Integer integer1=new Integer(num1); //Boxing/Wrapping
		int num2=integer1.intValue(); //unBoxing/unWrapping
		
		//easy way
		int num3=17;
		Integer integer3=num3; //Auto-Boxing/Auto-Wrapping/Auto-Converting
		int num4=integer3;
		
		//Double Wrapper
		double d1=7.5;
		Double d2=d1;//Auto-boxing
		
		//long way
		Double d3=new Double(8.7); //Boxing
		
		//Short way
		Double d4=8.7; //Auto-Boxing
		
		double d5=d4; //Auto-unBoxing
		
		boolean b1=true; //primitive
		Boolean b2=false; //Class/Object
		
		Character c='$'; //Auto-Boxing
		
		//int->Integer
		//byte->Byte
		//short->Short
		//long->Long
		//float->Float
		//double->Double
		//char->Character
		
		
		
	}

}
