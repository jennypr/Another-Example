package review2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int num=0;
		int total=0;
		
		System.out.println("Please enter a positive number! To STOP enter -1");
		num=scan.nextInt();
		
		while (num!=-1) {
			total+=num;
		}
		

	}

}
