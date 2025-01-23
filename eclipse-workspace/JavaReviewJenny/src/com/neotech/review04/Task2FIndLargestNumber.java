package com.neotech.review04;

public class Task2FIndLargestNumber {

	public static void main(String[] args) {
		
		int[][] nums = {
				{5,2,0},
				{8,1,7},
				{6,9,-2},
				{4,12,6}
				};
		int biggest=nums[0][0]; //we don't start with zero because numbers might be negative
		
		for (int row =0; row<nums.length; row++) {
			for (int col=0; col<nums[row].length;col++) {
				int element=nums[row][col];
				
				if(element>biggest) {
					//I found a bigger element
					//I have to update the biggest
					biggest=element;
				}
			}
		}

		System.out.println("The biggest number is -> "+biggest);
		
		System.out.println("----------");
		
		int max=nums[0][0];
		for (int[]row:nums) {
			for(int element:row) {
				if (element>max) {
					
					// I have foud the element
					max=element;
				}
			}
				
		}
		System.out.println("The max number is -> "+max);
		
	}

}
