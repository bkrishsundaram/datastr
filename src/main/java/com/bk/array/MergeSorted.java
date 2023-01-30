package com.bk.array;

import java.util.Arrays;

public class MergeSorted {

	public static void main(String[] args) {
     
		MergeSorted sorted = new MergeSorted();
		int  a1[] = {4,5,2,0,0,0};
		int a2[] = {5,9,2};
		
		System.out.println(Arrays.toString(sorted.sort(a1, 6, a2, 3)));
		
	}

	
	int[] sort(int a1[],int m,int a2[], int n ) {
		
		for(int i=0; i<n; i++) {
			a1[i+n] = a2[i];
		}
		
		Arrays.sort(a1);
		
		return a1;
	}
	
}
