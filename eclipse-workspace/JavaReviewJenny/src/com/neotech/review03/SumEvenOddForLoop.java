package com.neotech.review03;

public class SumEvenOddForLoop {

	public static void main(String[] args) {
		/* Add even numbers
		 * Also add Odd numbers
		 * Also add All numbers
		 * Between 1 && 20
		 * Using for loop
		 */
		
		int sumEven=0;
		int sumOdd=0;
		int total=0;
		
		for (int i=1; i<=20; i++)
		{
			if (i%2==0) {
				sumEven+=i;
			}else {
				sumOdd+=i;
			}
			total +=i;
			}
		System.out.println("The sum of even numbers is: " +sumEven);
		System.out.println("The sum of odd numbers is: "+ sumOdd);
		System.out.println("The total is: " +total);

	}


}
