package com.bk.top.str;

public class UniChar {
	
	
	public int uniChar(String s) {
		int n = s.length();
		int i =0;
		while ( i < n) {
			char ch = s.charAt(i);
			if(s.indexOf(ch) == s.lastIndexOf(ch)) {
				return i;
			}
			i++;
		}
		
	   return -1;	
		
	}
	

	public static void main(String[] args) {
		UniChar u = new UniChar();
		System.out.println(u.uniChar("balab"));
		

	}

}
