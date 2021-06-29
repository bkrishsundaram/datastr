package com.bk.gen;

public class CodeSam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //System.out.println(Integer.MIN_VALUE);
		
		int a[] = new int[4];
		
		CodeSam1 c = new CodeSam1();
		c.sumtwoTarget();
		
	}
	
	
	public void secHigh() {
		
		int arr[] = {12,87,45,67,34,5};
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int i : arr) {
			if( i > first) {
				second = first;
				first = i;
			}else if ( i > second) {
				second = i;
			}
		}
		
		System.out.println(second);
		
	}
	
	
	public void larsmall() {
		 int arr[] = new int[]{12,56,76,89,100,343,21,234};
		 
		 //assign first element of an array to largest and smallest
		 int small = arr[0];
		 int large = arr[0];
		 
		 for(int i = 1 ; i < arr.length; i++) {
			 
			 if( arr[i] > large ) {
				 large = arr[i];
				 
			 } else if (arr[i] < small) {
				 small = arr[i];
			 }
			 
		 }
	     System.out.println("large ===="+large + "    small =="+small);	 
	}
	
	
	public void sumtwoTarget() {
		int arr[] = new int[]{3, 4,12,5,9,10,100,343,21,234};
		int target = 22;
		int temp = 0;
		
		for(int i =0; i < arr.length; i++) {
			temp = arr[i];
			
			for(int j = i+1; j < arr.length; j++) {
				
				if( (arr[i]+arr[j]) == target) {
					 System.out.println("      "+i+"  "+j);
					 break;
				}
				
			}
			
		}
	}

}
