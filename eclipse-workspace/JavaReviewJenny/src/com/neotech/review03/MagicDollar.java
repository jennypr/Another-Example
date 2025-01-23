package com.neotech.review03;

public class MagicDollar {

	public static void main(String[] args) {
		// $$$$$
		// $$$$$
		// $$$$$
		// $$$$$
		
//		for(int row=1; row<=4; row++) {
//			for(int col=1; col<=5; col++) {
//				System.out.print("$");
//			}System.out.println();
//			
//		}

		for(int row=1; row<=4; row++) {
			for(int col=1; col<=5; col++) {
				if(row==1 || row==4|| col==1 || col==5) {
					System.out.print("$");
				} else {
					System.out.print(" ");
				}
			}System.out.println();
			
		}
		
		
	}

}
