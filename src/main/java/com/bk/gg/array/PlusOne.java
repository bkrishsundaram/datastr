package com.bk.gg.array;

import java.util.Arrays;

/*
 Given a non-empty array of decimal digits representing a non-negative integer,
increment one to the integer. The digits are stored such that the most significant
digit is at the head of the list, and each element in the array contains a single digit.
You may assume the integer does not contain any leading zero, except the number 0 itself.
 */

public class PlusOne {

	public int[] plusOne(int arr[]) {
		int n = arr.length-1;
		
		for(int i = n; i >= 0 ; i--) {
			if(arr[i] == 9) {
				arr[i] = 0;
			} else {
				 arr[i]++;
				 return arr;
			}
		}

	    arr = new int[arr.length];
	    arr[0] = 1;
	    return arr;
		
	}
	
	
	public static void main(String[] args) {

		PlusOne p = new PlusOne();
		int arr[] = {9,9,9,8,9};
		System.out.println(Arrays.toString(p.plusOne(arr)));
		
	}

}
