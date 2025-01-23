package com.neotech.review09;

import java.util.*;


public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<String> asia=new LinkedList<>();
		asia.add("Japan");
		asia.add("China");
		asia.add("Uzbekistan");
		asia.add("Japan");
		asia.add("Turkey");
		asia.add("India");
		asia.add("China");
		
		System.out.println("asia: "+asia);
		
		List<String> asia2=new LinkedList<>();
		
		for(String country:asia) {
			if(asia2.contains(country)) {
				continue;
			}
			else {
				asia2.add(country);
			}
		}
		System.out.println(asia2);
        
		
		
	}	

}
