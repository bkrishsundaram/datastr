package com.bk.top;

public class SetZero {

	
	public void setZero(int matrix[][]) {
		boolean row[] = new boolean[matrix.length];
		boolean col[] = new boolean[matrix[0].length];
		int m = matrix.length;
		int  n = matrix[0].length;
		
		for(int i=0; i < m ; i++) {
			for(int j=0;j <n; j++) {
				if(matrix[i][j]==0) {
					row[i] = true;
					col[j] = true;
				}
			}
		}
		
		 for(int i=0; i< row.length; i++) {
           if(row[i]) {
			 nullfyRow(matrix,i);
           }
		 }
		 
		 for(int j=0; j < col.length; j++) {
		  if(col[j]) {	 
			 nullfyCol(matrix,j);
		  }
		 }
		 
		 for(int i=0; i<m;i++) {
			 for(int j=0;j<n;j++) {
				 System.out.print("  " +matrix[i][j]);
			 }
			 System.out.println();
		 }
		
    	}
		
		public void nullfyRow(int matrix[][], int row) {
	        for(int j = 0; j< matrix[0].length;j++ )  {
	        	matrix[row][j] = 0;
	        }
		}
		
		public void nullfyCol(int matrix[][], int col ) {
			for(int i=0; i<matrix.length; i++) {
				matrix[i][col] = 0;
			}
		}
		
		
	
	
	public static void main(String[] args) {

		int matrix[][] = {
				{1,1,1,1},
				{1,0,1,1},
				{1,1,1,1},
				{0,1,1,1}
		                 };
		
		SetZero s = new SetZero();
		s.setZero(matrix);
		
	}

}
