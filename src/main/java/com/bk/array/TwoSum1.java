package com.bk.array;

public class TwoSum1{

	public static void main(String[] args) {
		
		TwoSum1 twosum = new TwoSum1();
		int arr[] = {3,4,5,6,7,8,10,11,13,15,16,17,18};
		
		int res[] = twosum.twosum(arr, 15);
		
		System.out.println(res[0]+"     "+res[1]);
		
	}
	
	
	
	
	public int[] twosum(int arr[], int target){
		
		int i =0; 
		int j = arr.length - 1;
		while(i < j) {
			if(arr[i]+arr[j] == target) {
				return new int[] {i,j};
			}else if(arr[i] + arr[j] < target) {
				i++;
			}else {
				j--;
			}
		}
		
		return new int[] {-1,-1};
	}
	

}
