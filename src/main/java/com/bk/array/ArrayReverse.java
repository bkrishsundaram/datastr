package com.bk.array;

import java.util.Arrays;

public class ArrayReverse {

	public int[] arrayReverse(int arr[]) {
		int n = arr.length;
		for(int i=0; i < n/2; i++) {
			int temp = arr[i];
			arr[i] = arr[n-1-i];
			arr[n-1-i] = temp;
		}
		return arr;
	}
	
	
	public static void main(String[] args) {

		int arr[] = {3,6,7,9,3,12,25,18};
		ArrayReverse rev = new ArrayReverse();
		System.out.println(Arrays.toString(rev.arrayReverse(arr)));
		
	}

}
