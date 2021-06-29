package com.bk.gg.mm;

public class LongestIncPath {
	
	
	 static final int dirs[][] = {{0,1},{1,0},{0,-1},{-1,0}};
	 int m , n;
	 
	 int longestIncreasingPath(int[][] matrix) {
		 if(matrix.length==0) {
			 return 0;
		 }
		 int m = matrix.length;
		 int n = matrix[0].length;
		 int ans = 0;
		 for(int i=0; i< m; ++i) {
			 for(int j=0; j< n; ++j) {
				 ans = Math.max(ans, dfs(matrix,i,j));
			 }
		 }
		 return ans;
	 }
	 
	 
	 int dfs(int [][] matrix, int i, int j) {
		 int ans =0;
		 for(int [] d : dirs) {
			 int x = i + d[0];
			 int y =  j + d[1];
			 if(0 <= x && x < m && 0 <= y && y < n && matrix[x][y] < matrix[i][j] ) {
				 ans = Math.max(ans, dfs(matrix,x,y));
			 }
		 }
		 return ++ans;
	 }
	

	public static void main(String[] args) {
	
		int matrix[][] =   {{3,4,5},{3,2,6},{2,2,1}};
		LongestIncPath p = new LongestIncPath();
		System.out.println(p.longestIncreasingPath(matrix));
	
	}

}
