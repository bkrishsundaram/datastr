package com.bk.am;

import java.util.Arrays;

public class UniquePath {

	public static void main(String[] args) {

		UniquePath up = new UniquePath();
		System.out.println(up.leetsolution(3, 7));
	}
	
	
	public int leetsolution(int m , int n) {
		int up[][] = new int[m][n];
		
		for(int[] arr : up) {
			  System.out.println(Arrays.toString(arr));
		      Arrays.fill(arr, 1);
		      System.out.println(Arrays.toString(arr));
		    }
		 for(int col=1;col<m;col++) {
			 for(int row=1;row<n;row++) {
				 up[col][row] = up[col-1][row] + up[col][row-1];
			 }
		 }
		 
		 for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					System.out.print("  "+up[i][j]+"  ");
				}
				System.out.println();
			}
		
		return up[m-1][n-1];
	}
		
	
	public int uniquePath(int m, int n) {
		int up[][] = new int[m+1][n+1];
		
		 for(int i=1; i<=m;i++) {
			 for(int j=1;j<=n;j++) {
				 if(i==1 || j==1) {
					 up[i][j] =1;
				 }else{
				  up[i][j] = up[i-1][j] + up[i][j-1];
				 }
			 }
		 }
			 
		for(int i=0;i<m+1;i++) {
			for(int j=0;j<n+1;j++) {
				System.out.print("  "+up[i][j]+"  ");
			}
			System.out.println();
		}
		 
		return up[m][n];
	}

}
