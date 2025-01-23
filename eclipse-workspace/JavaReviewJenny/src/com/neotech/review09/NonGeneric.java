package com.neotech.review09;

import java.util.*;

public class NonGeneric {
	public static void main(String[] args) {
		

		ArrayList europe=new ArrayList<>(); //Non-Generic
		europe.add("France");
		europe.add(60);
		europe.add('@');
		europe.add(true);
		
		for (Object element:europe) {
			System.out.println(element);
		}
		
	}
	


}
