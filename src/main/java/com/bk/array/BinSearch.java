package com.bk.array;

public class BinSearch {

	public static void main(String[] args) {
		
		BinSearch b = new BinSearch();
		
		int a[] = {2,4,5,7,8,9,10,15,27};
		int target = 5;
		System.out.println(b.binarySearch(a, target));
		
		
	}

	
	int binarySearch(int a[], int target) {
		int index = -1;
		
		int left =0;
		int right = a.length;
		
		while(left < right) {
			int mid = left + (right -left) /2;
			
			if( target == a[mid]) {
				return mid;
			} else if( a[mid] < target ) {
				left = mid;
			}else {
				right = mid;
			}
			
		}
		
		return index;
	}
	
}
