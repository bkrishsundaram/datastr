package com.bk.gg.mm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterSection {
	
	
	public int[] intersect(int arr1[], int arr2[]) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		List<Integer> inter = new ArrayList<>();
		int j=0;
		int i=0;
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] == arr2[j]  ) {
				inter.add(arr1[i]);
				i++;
				j++;
			}
			else if(arr1[i] < arr2[j]) {
				i++;
			}else {
				j++;
			}
		}
		
		int res[] = new int[inter.size()];
		for(int k=0; k< inter.size(); k++) {
			res[k] = inter.get(k);
		}
		return res;
	}
	
	

	public static void main(String[] args) {
		
		int arr1[] =  {2,5,7,8,9}; 
        int arr2[] = {4,7,8,10};
        
        InterSection i = new InterSection();
        int res[] = i.intersect(arr1, arr2);
        System.out.println(Arrays.toString(res));
        
	}

}
