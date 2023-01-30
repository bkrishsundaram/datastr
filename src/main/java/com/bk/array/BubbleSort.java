package com.bk.array;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {32,45,12,-32,6,9};
		
		for(int i = 0; i < arr.length ; i++) {
			for(int j=0; j < i; j++  ) {
				if(arr[j] > arr[j+1]) {
				 	int temp = arr[j];
				 	arr[j] = arr[j+1];
				 	arr[j+1] = temp;
				 	
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
