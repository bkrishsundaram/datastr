package com.bk.gg.array;

public class JumpGame {
	
	
	public boolean jumpos(int arr[]) {
		int lastpos = arr.length -1;
		
		for(int i = arr.length-1; i >= 0; i-- ) {
			if( i +arr[i] >= arr.length  ) {
				lastpos = i;
			}
		}
		 return lastpos == 0 ? false : true;
	}
	

	public static void main(String[] args) {

		int arr[] = {};
		
	}

}
