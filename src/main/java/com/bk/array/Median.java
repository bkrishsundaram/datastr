package com.bk.array;

import java.util.Arrays;

public class Median {

	 public float median(int arr1[], int arr2[]) {
		 float median = 0;
	     int sum[] = new int[arr1.length + arr2.length];
	     int n1 = arr1.length;
	     int n2 = arr2.length;
	     int n = 0;
	     
	     for(int i =0;  i< n1; i++  ) {
	    	 sum[n++] = arr1[i];
	     }
	     for(int j=0; j<n2;j++) {
	    	 sum[n++] = arr2[j];
	     }
	      Arrays.sort(sum); 
	      
	      int mid = sum.length /2;
	      if( sum.length %2 == 0) {
	    	  median = (float) (sum[mid - 1 ] + sum[mid]) / 2;
	      } else {
	    	  median = sum[mid];
	      }
		 
		 return median;
	 }
	
	
	public static void main(String[] args) {
		 
		int arr1[] =  {3,5,7,2,5};
		int arr2[] =  {5,7,3,9,45};
		
		Median m = new Median();
		System.out.println(m.median(arr1, arr2));

	}

}
