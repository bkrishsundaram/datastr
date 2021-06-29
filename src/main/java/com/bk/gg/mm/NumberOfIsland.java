package com.bk.gg.mm;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIsland {
	
	
	
	private void dfs(char[][] grid, int r, int c) {
		int nr = grid.length;
		int nc = grid[0].length;
		
		if(r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c]=='0') {
			return;
		}
		
		grid[r][c] ='0';
		dfs(grid,r-1,c);
		dfs(grid,r+1,c);
		dfs(grid,r,c-1);
		dfs(grid,r,c+1);
	}

	public int numIsland(char grid[][]) {
		
		if(grid.length==0 || grid[0].length==0) {
			return 0;
		}
		
		int nr = grid.length;
		int nc = grid[0].length;
		int num_island = 0;
		
		for(int r = 0; r < nr ; r++) {
			for(int c=0; c < nc ; c++) {
				if(grid[r][c]=='1') {
					System.out.println("========="+r+"   "+c+"   "+grid[r][c]);
					++num_island;
					dfs(grid,r,c);
				}
			}
		}
		
		
		
		return num_island;
	}
	
	
	/* BFS */
	public int numIsland_BFS(char[][] grid )  {
		
		if(grid.length ==0 || grid[0].length ==0) {
			return 0;
		}
		
		int nr = grid.length;
		int nc = grid[0].length;
		int num_island =0;
		
		for(int r =0 ; r < nr; r++) {
			for(int c =0; c < nc; c++) {
				if(grid[r][c] =='1') {
					++num_island;
					grid[r][c] ='0';
					Queue<Integer> neighbor = new LinkedList<>();
					
				}
			}
		}
		
		
		return 0;
	}

	public static void main(String[] args) {
		 
		NumberOfIsland n = new  NumberOfIsland();
		char grid[][] = {
				            { '1','1','0','0','0'},
                            {'1','1','0','0','0'},
                            {'0','0','1','0','0'},
                            {'0','0','0','1','1'}
		                };
		
		  
	     System.out.println(n.numIsland(grid)); 	
	}

}
