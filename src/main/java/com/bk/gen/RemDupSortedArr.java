package com.bk.gen;

public class RemDupSortedArr {

	public static void main(String[] args) {
		
		int nums[] =  {3,4,4,5,6,7,8};
		
		RemDupSortedArr r = new RemDupSortedArr();
		System.out.println (r.removeDuplicates(nums));
	}
	
	public int removeDuplicates(int nums[]) {
		int i =0;
		
		if(nums.length ==0)  return 0;
		
		
		for(int j=1; j < nums.length ; j++ ) {
			if(nums[i] != nums[j]) {
				i++;
			}
			nums[i] = nums[j]; 
		}
	  return i+1;	
	}

}
