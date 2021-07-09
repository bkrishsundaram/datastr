package com.bk.am;

import java.util.HashMap;
import java.util.Map;

public class UniChar {

	 public int usingIndex(String str){
		 str = str.toLowerCase();
		 for(int i =0 ; i< str.length(); i++) {
			 char ch = str.charAt(i);
			 if(str.indexOf(ch) == str.lastIndexOf(ch)) {
				 return i;
			 }
		 }
		 
		 return -1;
	 }
	 
	 public int usingAscii(String str) {
		 int a[] = new int[26];
		 str = str.toLowerCase();
		 for(int i=0;i<str.length(); i++) {
			 char ch = str.charAt(i);
			 int index = ch -'a';
			 a[index]++;
		 }
		 
		 for(int i=0; i<str.length(); i++) {
			 int index = (str.charAt(i) - 'a');
			 if(a[index] ==1) {
				 return i;
			 }
		 }
		 
		 return -1;
	 }
	 
   public int usingMap(String str) {
		 str = str.toLowerCase();
		 Map<Character, Integer> map = new HashMap<>();
		 
		 for(int i=0; i< str.length(); i++) {
			 char ch = str.charAt(i);
			 map.put(ch, map.getOrDefault(ch, 0)+1);
		 }
		 for(int i =0 ; i<str.length(); i++) {
			 if(map.get(str.charAt(i))==1) {
				 return i;
			 }
		 }
		 return -1;
	 }
	
	
	public static void main(String[] args) {

		UniChar c = new UniChar();
	    String str = "balaBb";	
	    //System.out.println(c.usingIndex(str)); 	
	    //System.out.println(c.usingAscii(str));
	    System.out.println(c.usingMap(str));

	}

}
