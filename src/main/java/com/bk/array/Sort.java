package com.bk.array;

import java.util.Arrays;

public class Sort {

	 public int[] bubbleSort(int arr[]) {
		 
		 for(int i=0;i <arr.length; i++) {
			 for(int j=0;j<i; j++) {
				 if (arr[j] > arr[j+1]) {
					 int temp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1] = temp;
				 }
				 
			 }
		 }
		 
		 
		 return arr;
	 }
	 
	 public int[] selectionSort(int arr[]) {
		 
		 for(int i =0; i< arr.length; i++) {
			 int low = i;
		    
			 for(int j= i; j<arr.length; j++) {
				 if(arr[j] < arr[low]) {
					 low = j;
				 }
			 }
		     int temp = arr[low];
		     arr[low] = arr[i];
		     arr[i] = temp; 
         	 
			 
		 }// out for loop
		 
		 return arr;
	 }
	 
	 public int[] insertinSort(int arr[]) {
 
		 return arr;
	 }
	 
	 
	 public int[] mergeSort(int arr[]) {
		 
		 return arr;
	 }
	
	 public int[] quickSort(int arr[]) {
		 
		 return arr;
	 }
	 
	
	
	public static void main(String[] args) {
       
		int arr[] = {2,7,23,45,12,49,65};
		
		Sort s = new Sort();
		int res[];
		//res = s.bubbleSort(arr);
		res = s.selectionSort(arr);
		System.out.println(Arrays.toString(res));
		
	}

}
