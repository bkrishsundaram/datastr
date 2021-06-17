package com.bk.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {


     public int[] brutforce(int arr[], int target) {
    	 
    	 for(int i=0 ; i < arr.length; i++) {
    		 for(int j= i+1 ; j < arr.length; j++) {
    			 if (arr[i] + arr[j] == target ) {
    				 return new int[] {i,j};
    			 }
    		 }

    	 }
    	 return new int[] {-1,-1}; 
     }
	
     public int[] mapspace(int arr[], int target) {
    	 Map<Integer, Integer> map = new HashMap<>();
    	 for(int i=0; i< arr.length; i++) {
    		 int bal = target - arr[i];
    		 if(map.containsKey(bal)) {
    			 return new int[] {map.get(bal),i};
    		 }
    		  map.put(arr[i], i);
    	 }
    	 
    	 return new int[] {-1,-1};
     }
     
     public int[] sortedSum(int arr[], int target) {
    	 int i=0;
    	 int j = arr.length-1;
    	 while( i < j) {
    		 if(arr[i] + arr[j] == target) {
    			 return new int[] {i,j};
    		 }else if(arr[i] + arr[j] < target) {
    			 i++;
    		 }else {
    			 j--;
    		 }
    	 }
    	 
    	 return new int[] {-1,-1};
     }
     
	
	public static void main(String[] args) {

		  int arr[] = {2,4,6,7,9,23,34};
		  TwoSum t = new TwoSum();
		  int res[];
		  //res =  t.brutforce(arr, 13);
		   //res = t.mapspace(arr, 13);
		   res = t.sortedSum(arr, 13);
		  System.out.println(Arrays.toString(res));
		
	}

}
