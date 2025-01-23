package com.neotech.review04;

public class TwoDimensionArrayIntro {

	public static void main(String[] args) {
		
		int[][] numbers=new int [3][4];//[rows][columns]
		//2D-Array is an array of 1D arrays
		// every element is a 1D array
		
		int columns=numbers.length;
		System.out.println(columns);
		
		//Nested enhanced for loops
		
		int[][]nums= {
				{5,2,0},
				{8,1,7},
				{6,9,-2},
				{4,2,6}
				
		};
		
		int[]row2=nums[2];
		for (int el:row2) {
			System.out.print(el+" ");
		}System.out.println();
		
		for(int[]row:nums) {
			for (int i=0; i<row.length; i++) {
				System.out.print(row[i]+" ");
				
			}System.out.println();
			
		}

	}

}
