package com.bk.array;

import java.util.Arrays;

public class Sort {

	 public int[] bubbleSort(int arr[]) {
		 
		 for(int i=0;i <arr.length; i++) {
			 for(int j=0;j<i; j++) {
				 if (arr[j] > arr[j+1]) {
					 int temp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1] = temp;
				 }
				 
			 }
		 }
		 
		 
		 return arr;
	 }
	
	
	
	public static void main(String[] args) {
       
		int arr[] = {2,7,23,45,12,45,65};
		
		Sort s = new Sort();
		int res[];
		res = s.bubbleSort(arr);
		
		System.out.println(Arrays.toString(res));
		
	}

}
