package com.bk.array;

public class RorateArray {
	
	public void rorate(int nums[], int k) {
		
		 int ans[] = new int[nums.length];
		 for (int i=0; i< nums.length; i++) {
			 ans[(i+k)%nums.length] = nums[i];
		 }
		 
		 for(int i=0; i < ans.length; i++) {
			 nums[i] = ans[i];
		 }
		
	}

	public static void main(String[] args) {
	 

	}

}
