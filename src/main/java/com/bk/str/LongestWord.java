package com.bk.str;

import java.util.Scanner;

public class LongestWord {

	 public String lontWord(String str) {
		 
		 
		 String arr[] = str.split("[^a-z^0-9]");
		 
		 for  (int i=0; i<arr.length; i++) {
			  String st = arr[i];
			 
			  String t = "";
			  for (int j=0;j < st.length(); j++) {
				  
				  char ch = st.charAt(j);
				  int ascii = ch;
				  if ( ascii >= 97 && ascii <= 122) {
					t = t + String.valueOf(ch);  
				  }
				  
			  }
			  
			  arr[i] = t;
			  //System.out.println(arr[i]);
		 }
		 
		 int longest = 0;
		 int index = 0;
		 
		 for (int i =0; i< arr.length; i++) {
			 if(arr[i].length() > longest) {
				 longest = arr[i].length();
				 index = i;
			 }
		 }
		 
		 
		 
		 return arr[index];
	 }
	
	
	public static void main(String args[]) {
		
		LongestWord l = new LongestWord();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter a sentence");
		System.out.println();
		
		String str = scanner.nextLine();
		
		System.out.println("Longestd =========== ");
		
		System.out.println(l.lontWord(str));
		scanner.close();
		
		
	}
	
}
