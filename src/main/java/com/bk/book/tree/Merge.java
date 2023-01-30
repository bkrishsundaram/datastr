package com.bk.book.tree;


import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {
  
		int a[] = {3,5,6,8,19};
		int b[] = {7,11,13,45,67,78};
		
		int c[] = new Merge().merge(a, b);
		System.out.println(Arrays.toString(c));
		
	}
	

	 public int[] merge(int a[], int b[]) {
		 int c[] = new int[a.length+b.length];
		 
		 int alen=0, blen=0, clen =0;
		 
		 while( alen < a.length && blen < b.length) {
			 if(a[alen] < b[blen]) {
				 c[clen++] = a[alen++];
			 }else{
				 c[clen++] = b[blen++];
			 }
		 }
		 
		 while(alen < a.length) {
			  c[clen++] = a[alen++];
		 }
		 
		 while(blen < b.length) {
			 c[clen++] = b[blen++];
		 }
		 
		 return c;
	 }

}
