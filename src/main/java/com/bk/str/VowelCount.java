package com.bk.str;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class VowelCount {
	
	
	public int  vowelCountPatter(String str ) {
		
		return Pattern.compile("[^aeiouAEIOU]").matcher(str).replaceAll("").length();
		
	}
	
	public int vowelCountArray(String str) {
		
		ArrayList<Character> arr = new ArrayList<>();
		arr.add('a');
		arr.add('e');
		arr.add('i');
		arr.add('o');
		arr.add('u');
		
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(arr.contains(str.charAt(i))) {
				count++;
			}
		}
		
		return  count;
		
	}
	
	
	public int vowelCountcheck(String str) {
		int count = 0;
		
		 str = str.toLowerCase();
		 for(int i=0; i< str.length(); i++) {
			 
			 if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ) {
				 count++;
			 }
			 
		 }
		
		
		return count;
	}
	

	public static void main(String[] args) {
		
		String str = "hello";
		
		VowelCount c = new VowelCount();
		System.out.println(c.vowelCountPatter(str));
		System.out.println(c.vowelCountArray(str));
		System.out.println(c.vowelCountcheck(str));
		 

	}

}
