package com.bk.am;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

		TwoSum t = new TwoSum();
		int arr[] = {2,3,4,5,6,7,8};
		int target = 13;
		 int res[];
		 //res = t.bruteForce(arr, target);
		// res = t.twosumsorted(arr, target);
		   res = t.usinghash(arr, target);
		 System.out.println(Arrays.toString(res));
		 
	}
	
	
	public int[] bruteForce(int arr[], int target) {
		
		for(int i=0; i< arr.length; i++) {
			  for(int j=i+1; j< arr.length; j++) {
				if(target == arr[i]+arr[j]) {
					return new int[] {i,j};
				}
			}
		}
		
		 throw new IllegalArgumentException();
	}
  
	
	public int[] twosumsorted(int arr[], int target) {
		int left = 0;
		int right = arr.length-1;
		
		while(left <= right) {
			
			if(arr[left] + arr[right] == target) {
				 return new int[] {left, right};
			}else if (arr[left] + arr[right] < target) {
				 left++;
			}else {
				right--;
			}
			
		}
		
		
		throw new IllegalArgumentException();
	}
	
	public int[] usinghash(int arr[], int target) {
		
		  HashMap<Integer, Integer> map = new HashMap<>();
		  for(int i=0; i< arr.length; i++) {
			  int complement = target - arr[i];
			  if(map.containsKey(complement)) {
				  return new int[] {map.get(complement), i};
			  }
			  map.put(arr[i], i);
		  }
		  
		
		throw new IllegalArgumentException();
	}
	
}
