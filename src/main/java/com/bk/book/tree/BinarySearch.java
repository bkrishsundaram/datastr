package com.bk.book.tree;


public class BinarySearch {

	public static void main(String[] args) {

		BinarySearch b  = new BinarySearch();
		int arr[] = {3,5,7,8,10,12,15,18};
		int search = 15;
		//System.out.println(b.binarySearch(arr, search));
		System.out.println(b.recFind(arr, search,0,arr.length-1));

	}
	
	
	public String binarySearch(int arr[], int search) {
		
		int lower=0, upper= arr.length-1;
		int cur=0;
		while(lower < upper) {
		   cur = (lower + upper) /2;
		   if(arr[cur] == search) {
			   return cur+"   "+arr[cur];
		   }
		   if(arr[cur] < search) {
			   lower = cur + 1;
		   }else {
			   upper = cur -1;
		   }
		}
       return "-1";		
	}
	
	
	public String recFind(int arr[], int search, int lower, int upper) {
		
		int cur =( lower + upper )/2 ;
		
		if(arr[cur] == search) {
			return cur+ "  " +arr[cur]; 
		} 
		else if( lower > upper) {
			return "-1";
		}else {
			if(arr[cur] < search){
				return recFind(arr, search, cur+1, upper  );
			}else {
				return recFind(arr, search,lower, cur-1);
			}
		}
		
		//return "-1";
	}

}
