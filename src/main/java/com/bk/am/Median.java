package com.bk.am;

public class Median {
	
	 public float median(int arr1[], int arr2[]) {
		 float result = 0;
		 int n1 = arr1.length;
		 int n2 = arr2.length;
		 int sum[] = new int[n1+n2];
		 int i=0;
		 int j=0;
		 int index =0;
		 
		 while(i < n1 && j < n2 ) {
			 if (arr1[i] < arr2[j]) {
				 sum[index++] = arr1[i++];
			 }else {
				 sum[index++] = arr2[j++];
			 }
		 }
		 
		 if(i== arr1.length && j != arr2.length ) {
			 while(j < n2) {
				 sum[index++] = arr2[j++];
			 }
		 }else if(i != arr1.length && j == arr2.length) {
			  while(i < n1) {
				  sum[index++] = arr1[i++];
			  }
		 }
		 
		 int mid = sum.length / 2;
		 if( sum.length % 2 == 0) {
			 result = (float) (sum[mid-1] +sum[mid]) / 2;
		 }else {
			 result = sum[mid];
		 }
		 
		 return result;
	 }
	
	
	public static void main(String[] args) {
		int arr1[] = {3,6,7,8,9};
		int arr2[] = {5,9,10,14,15,17};
		
		System.out.println(new Median().median(arr1, arr2));

	}
	
	
}
