package com.bk.array;

import java.util.Arrays;

public class kthSmallest {
	
	
	 public int kthSmallestEl(int [][] matrix, int k ) {
		 
		 int n = matrix.length;
		 int[] temp = new int[n*n];
		 int point = 0;
		 
		 for(int i=0; i<matrix.length;i++) {
			 for(int j : matrix[i]) {
				  temp[point++] = j;
				 // System.out.println(j);
			 }
		 }
		 
		 Arrays.sort(temp);
		 		 
		 return temp[k-1];
	 }
	 
	

	public static void main(String[] args) {
		
		kthSmallest k = new kthSmallest();
		int [][] mat = new int[][] {
			{2,3,4},
			{6,7,8},
			{3,7,9}
		};
		
		System.out.println(k.kthSmallestEl(mat, 5));

	}

}
