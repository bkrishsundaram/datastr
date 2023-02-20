package com.bk.google;

/*
 * Have the function ArrayAddition(arr) take the array of numbers stored in arr and return the string true if 
 * any combination of numbers in the array (excluding the largest number) can be added up to equal the largest
 *  number in the array, otherwise return the string false. For example: if arr contains [4, 6, 23, 10, 1, 3] the 
 *  output should return true because 4 + 6 + 10 + 3 = 23. The array will not be empty, will not contain all the
 *   same elements, and may contain negative numbers.
 */
public class ArrayAddition {
	
	
	public static boolean ArrayAddition(int[] arr) {
	      
		int max = 0;
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println("Max ========"+max + "    "+index);
		for(int i=0; i<arr.length;i++) {
			int sum = 0;
			for(int j=i; j < arr.length; j++ ) {
				if (i != index || j != index) {
					sum = sum + arr[j];
					if(sum == arr[index]) {
						return true;
					}
				}
			}
			
		}
		
	    return  false;
	  }

	public static void main(String[] args) {
		
		int arr[] = new int[]  {5,7,16,1,2};
		
		System.out.println(ArrayAddition.ArrayAddition(arr));

	}

}
