package com.bk.array; 

import java.util.Arrays;

public class SquareSorted {

	public static void main(String[] args) {
		
		SquareSorted sq = new SquareSorted();
		int arr[] = {-4, -1, 0, 2, 3, 9};
		//sq.timeSapce(arr);
		
		arr = sq.spaceOne(arr);
		
		System.out.println(Arrays.toString(arr));
		

	}
	
	public int[] timeSapce(int arr[]) {
		
		for(int i=0; i< arr.length; i++) {
			arr[i] = arr[i] * arr[i];
		}
		
		Arrays.sort(arr);
		return arr;
	}
	
	
	public int[] spaceOne(int[] arr) {
	 
		int n = arr.length;
		int left = 0;
		int right = n-1;
		int result[] = new int[n];
		int square = 0;
		for(int i = n-1; i>=0; i--) {
			if(Math.abs(arr[left]) < Math.abs(arr[right]) ) {
				square = arr[right];
				right--;
			}else {
				square = arr[left];
				left++;
			}
			
			result[i] = square * square;
		}
		
		
		return result;
		
	}
	

}
