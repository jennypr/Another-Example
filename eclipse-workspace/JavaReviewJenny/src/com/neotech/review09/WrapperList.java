package com.neotech.review09;

import java.util.ArrayList;
import java.util.Iterator;

public class WrapperList {

	public static void main(String[] args) {
	
	// ArrayList can only store object/classes
	//	ArrayList<int> numbers=new ArrayList<>();
		
		ArrayList<Integer> numbers=new ArrayList<>();
		
		boolean isEmpty=numbers.isEmpty();
		System.out.println("Is it empty? "+ isEmpty);
		System.out.println("The size is ->"+numbers.size());
		
		numbers.add(new Integer(5)); //This is the long and not preffered way
		numbers.add(9); //This is the easy way. Auto-Boxing
		numbers.add(6);
		numbers.add(3);
		numbers.add(2);
		
		System.out.println("The size is "+numbers.size());
		
		System.out.println("how can we iterate ArrayList?");
		System.out.println("first way is using normal for loop");
		
		for(int i=0; i<numbers.size();i++) {
			Integer element=numbers.get(i); //Auto-Unboxing
			System.out.println(i);
		}
		
		System.out.println("second was is using the enhanced for loop");
		for(int element:numbers) {
			System.out.println(element);
		}
		
		System.out.println("the third way is using the iterator");
		
		Iterator<Integer> it=numbers.iterator();
		
		//There are 3 methods in the Iterator class
//		it.hasNext(); //this method will return true or false if there is a next element
//		it.next(); //this method will return the next element from the list
//		it.remove();// this method will remove the current element from the list
		
//		System.out.println(it.next()); //It will move to the next element and get the value
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next()); // we have runtime error
		
		while(it.hasNext()) {
			int element=it.next();
			System.out.println(element);
		}

	}

}
