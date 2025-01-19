package HomeworkClass27;

import java.util.ArrayList;

public class Homework {

	public static void main(String[] args) {
	/*	Create a ArrayList that will store 5 names into it.
		▪ Find out whether the given ArrayList is empty or not?
		▪ Check whether the specific name is present in an ArrayList or not?
		▪ Find the size of your ArrayList and print all values from the ArrayList */
		
		ArrayList<String> names=new ArrayList<>();
		names.add("Jenny");
		names.add("Maria");
		names.add("John");
		names.add("Nick");
		names.add("Sarah");
		
		System.out.println("Is array list empty? "+names.isEmpty());
		
		System.out.println("Is name Jenny in this array list?"+names.contains("Jenny"));
		System.out.println("Is name Maria in this array list?"+names.contains("Maria"));
		System.out.println("Is name John in this array list?"+names.contains("John"));
		System.out.println("Is name Nick in this array list?"+names.contains("Nick"));
		System.out.println("Is name Sarah in this array list?"+names.contains("Sarah"));
		
		System.out.println(names.size());
		System.out.println(names);
		

	}

}
