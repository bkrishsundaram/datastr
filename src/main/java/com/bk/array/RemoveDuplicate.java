package com.bk.array;

import java.util.Arrays;

public class RemoveDuplicate {
	
	 public void check(int num[]) {
		 int i = 0;
		 for (int n : num) {
			if (i==0  || num[i-1] != n) {
				num[i] = n;
				i++;
			}
		 }
		 
		 
		 for(int j=0;j<i;j++) {
			 System.out.print("   "+num[j]);
		 }
		  
	 }

	public static void main(String[] args) {
		 
		RemoveDuplicate r = new RemoveDuplicate();
		int n[] = {3,3,4,4,5};
		r.check(n);

	}

}
