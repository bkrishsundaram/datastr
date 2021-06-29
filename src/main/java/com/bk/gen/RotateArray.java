package com.bk.gen;

public class RotateArray {

	public static void main(String[] args) {

		 
		RotateArray r = new RotateArray(); 
		int nums[] = new int[] {1,3,8,13};
		r.rotate(nums,3); 
		
		 
		 
		
	}

	
	
	
	public void rotate(int nums[], int n) {
      
		if(nums.length== 0 || nums.length == 1 || nums.length == n) return;
		
		 n %= nums.length ;
		 System.out.println("n======="+n);
		
		int temp , prev;
		
		for(int i = 0; i< n ; i++) {
			 prev = nums[nums.length - 1];
			 for(int j =0; j< nums.length; j++) {
				 temp = nums[j];
				 nums[j] = prev;
				 prev = temp;
				 
			 }
			
		}
		
		for(int i=0 ; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		
	}
	
}
