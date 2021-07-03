package com.bk.top.str;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDup {

	public int usingSort(int num[]) {
		Arrays.sort(num);
		
		for(int i =1; i < num.length; i++) {
			if(num[i] == num[i-1]) {
				return num[i];
			}
		}
		
		return -1;
	}
	
	public int usingSet(int num[]) {
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i< num.length; i++) {
			if(set.contains(num[i])) {
				return num[i];
			}
			set.add(num[i]);
		}
		
		
		return -1;
	}
	
	
	public static void main(String[] args) {

		FindDup f = new FindDup();
		int a[] = {2,4,7,9,4};
		System.out.println(f.usingSort(a));
		System.out.println(f.usingSet(a));
	}

}
