package com.bk.gen;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
	
		PlusOne p = new PlusOne();
		
		int arr[] = {9,9,9};
		
		arr = p.plusOne(arr);
		
		System.out.println(Arrays.toString(arr));
     

	}
	
	
	
	public int[]  plusOne(int arr[]) {
		
		int n = arr.length;
		
		for(int i = n-1; i >= 0 ; i--) {
			
			if(arr[i] == 9) {
				arr[i] = 0;
			}else {
				arr[i]++;
				return arr;
			}
			
			
		}
		
		arr  = new int[n+1];
		arr[0]++;
		
		return arr;
	}
	
}
