package com.bk.am;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {

		TwoSum t = new TwoSum();
		int arr[] = {17, 4, 5, 6, 10, 11, 4, -3, -5, 3, 15, 2, 7};
		int target = 13;
		 int res[];
		 //res = t.bruteForce(arr, target);
		// res = t.twosumsorted(arr, target);
		   res = t.usinghash(arr, target);
		// System.out.println(Arrays.toString(res));
		 
		   System.out.println(t.twosumall(arr));
		   
		 
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
	
	/*Have the function TwoSum(arr) take the array of integers stored in arr, and determine if any two numbers 
	 * (excluding the first element) in the array can sum up to the first element in the array. For example: 
	 * if arr is [7, 3, 5, 2, -4, 8, 11], then there are actually two pairs that sum to the number 7: [5, 2] 
	 * and [-4, 11]. Your program should return all pairs, with the numbers separated by a comma, in the order
	 *  the first number appears in the array. Pairs should be separated by a space. So for the example above, 
	 * your program would return: 5,2 -4,11 */
	
	  public String twosumall(int arr[]) {
		  int len = arr.length;
		  String result = "";
		  int target = arr[0];
		  for (int i=1; i<len; i++) {
			  for (int j=i; j<len;j++) {
				  if (i != j && (arr[i] + arr[j] == target)) {
					  result = result + arr[i] + " , " + arr[j]+"  ";
				  }
			  }
		  }
		  
		  if (result.length() > 1) {
			  return result;
		  } else {
			  return "-1";
		  }
		  
	  }
	
}
