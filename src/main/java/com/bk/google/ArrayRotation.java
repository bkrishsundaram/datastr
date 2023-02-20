package com.bk.google;

public class ArrayRotation {
	
	public static int ArrayRotation(int[] arr) {
		
		String result = "";
		
		for(int i=arr[0]; i < arr.length; i++) {
			result = result + String.valueOf(arr[i]);
		}
		
		for(int i=0; i<arr[0]; i++) {
			result = result + String.valueOf(arr[i]);
		}
		
	     
	    return Integer.valueOf(result);
	  }

	public static void main(String[] args) {
		 
	    int arr[] = new int[]  {4,3,4,3,1,2};
	    System.out.println(ArrayRotation.ArrayRotation(arr));

	}

}
