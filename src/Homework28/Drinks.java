package Homework28;

import java.util.ArrayList;
import java.util.Iterator;

/*Homework 1:
    Create an arrayList of drinks. If any drink has letter "a" or "e" replace it with water.  */


public class Drinks {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<>();
		list.add("Milk");
		list.add("Latte");
		list.add("Cocktail");
		list.add("Juice");
		
		Iterator<String> dr=list.iterator();
		
		while(dr.hasNext()) {
			String drink=dr.next();
			if(drink.contains("e")|| drink.contains("a")) {
				
				int index=list.indexOf(drink);
				list.set(index, "water");
					
				System.out.println(list);
			}
		}
	}

}
