package com.neotech.review04;

public class TwoD_ArrayIntro3 {

	public static void main(String[] args) {
		
		
		int[][] nums= {
				{8,3},
				{5,9,1,4},
				{7} 
		};
		
		System.out.println("The number of row is -> "+nums.length);
		System.out.println("he length of row with index 1 is -> "+nums[1].length);
		
		for(int row=0; row<nums.length; row++) {
			
			//nums[row].length  this will give me the length of that specific row
			for (int j=0; j<nums[row].length ; j++) {
				System.out.print(nums[row][j]+" ");
			}System.out.println();
			
			System.out.println("--------");
			
			for(int[]row1:nums) {
				for (int element :row1) {
					System.out.print(element+" ");
					
				}System.out.println();
				
			}
			
		}

	}

}
