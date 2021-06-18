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
	
	
	
	public static void main(String[] args) {
	  int arr[] = {4,7,9,23,67,34};
	  LargestElement l = new LargestElement();
	  System.out.println(l.findLargestElement(arr, 3));
		
	}

}
