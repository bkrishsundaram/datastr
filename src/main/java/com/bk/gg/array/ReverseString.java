package com.bk.gg.array;

public class ReverseString {

	 public boolean checkPalingUsingChar(String str) {
		 String rev = "";
		 int i = str.length()-1;
		 while(i >= 0) {
			 rev = rev + str.charAt(i);
			 i--;
		 }
		 return rev.equals(str) ? true : false;
	 }

	 public boolean checkIndex(String str) {
		 
		 int i =0;
		 int j = str.length() -1;
		 
		 while( i < j) {
			 
			 if(str.charAt(i) != str.charAt(j)) {
				 return false;
			 }
			 i++;
			 j--;
		 }
		 
		 return true;
		 
	 }
	 
	
	public static void main(String[] args) {
     
		ReverseString r = new ReverseString();
	//	System.out.println(r.checkPalingUsingChar("balb"));
		System.out.println(r.checkIndex("balab"));
		
		 
		
		
	}

}
