package com.bk.top;

import java.util.Arrays;

public class ProductArrayExSelf {

	 public int[] productArray(int arr[]) {
		 int res[] = new int[arr.length];
		  int n = arr.length;
		  for(int i=0; i<n; i++ ) {
			    int sum = 1;
			  for(int j=0; j<n; j++) {
				  if(i != j) {
					  sum = sum * arr[j];
				  }
			  }
			  res[i] = sum;
		  }
		 
		 
		 return res;
	 }
	
	
	public static void main(String[] args) {

		int arr[] = {1,2,3,4};
		ProductArrayExSelf p = new ProductArrayExSelf();
		int res[] = p.productArray(arr);
		System.out.println(Arrays.toString(res));
		
	}

}
