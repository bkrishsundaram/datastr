package com.bk.gg.array;

import java.util.Arrays;

public class RemoveDuplicate {

	 
	public int removeDup(int arr[]) {
		if(arr.length == 0) return 0;
		int i=0;
		for(int j=1; j<arr.length;j++) {
			if(arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}
		return i+1;
		
	}

	public int[] removeUsingTemp(int arr[]) {
		int n = arr.length;
		int temp[] = new int[n];
		int j =0;
		
		for(int i=0;i<n-1;i++){
			
			if(arr[i] != arr[i+1] ) {
				temp[j++] = arr[i];
			}
		}
	    temp[j] = arr[n-1];
		arr = temp;
	    return arr;
	}
	
	
	
	public static void main(String[] args) {

		int arr[] = {2,4,6,8,8,10,12,14,14};
		RemoveDuplicate r = new RemoveDuplicate();
		System.out.println(r.removeDup(arr));
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(r.removeUsingTemp(arr)));
	}

}
