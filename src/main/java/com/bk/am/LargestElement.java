package com.bk.am;

import java.util.PriorityQueue;

public class LargestElement {

	public int findLargestElement(int num[], int k) {
		PriorityQueue<Integer> heap = new PriorityQueue<>((n1,n2) -> n1-n2);
		
		for(int n : num) {
			heap.add(n);
			if(heap.size() > k) {
				heap.poll();
			}
		}
		
		return heap.poll();
	}
	
	public void check(int k) {
		 
		int arr[][] = {
				{64,6,8},
				{12,23,56},
				{3,9,10}
				
		};
		
	 int n[] = new int[arr.length*arr[0].length];
	 int index = 0;
	 
	 for(int i =0;i<arr.length;i++) {
		 for(int j=0;j<arr[0].length;j++) {
			 n[index++] = arr[i][j];
		 }
	 }
	
	
	for(int i=0; i<index; i++) {
		System.out.print("  "+n[i]);
	}
	 System.out.println();
	PriorityQueue<Integer> heap = new PriorityQueue<>();
	
	for(int num : n) {
		heap.add(num);
		if(heap.size() > k) {
			System.out.println(heap.poll());
		}
	}
	
	 System.out.println(" k the largest element   " + heap.poll());
	 
   }
	
	
	public static void main(String[] args) {
	  int arr[] = {4,7,9,23,67,34};
	  LargestElement l = new LargestElement();
	  //System.out.println(l.findLargestElement(arr, 3));
	  l.check(5);
		
	}

}
