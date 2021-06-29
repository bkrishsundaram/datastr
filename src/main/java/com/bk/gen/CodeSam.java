package com.bk.gen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CodeSam {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CodeSam code = new CodeSam();
		
		System.out.println("enter a string");
		
		//String s1 = s.next();
		//System.out.println("enter a string");
		//String s2 = s.next();
		//call here
	    code.checkOdd();
	    
		s.close();

	}
	
	
	
	public void stringRevers(String input) {
		String str = input;
		String rev = "";
		int len = str.length();
		
		for(int i = len-1; i >= 0 ; i-- ) {
			
			rev = rev + str.charAt(i);
			
		}
		
		System.out.println("reverse ==================="+rev);
		
	}
	
	public void anagram(String s1, String s2) {
		
		char a1[] = s1.toLowerCase().toCharArray();
		char a2[] = s2.toLowerCase().toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		String r1 = String.valueOf(a1);
		String r2 = String.valueOf(a2);
		
		if(r1.equals(r2)) {
			System.out.println("two string are anagram");
		} else {
			System.out.println("two string are not anagram");
		}
		
	}
	
	public void uniqChar(String str) {
		
		HashSet<Character> h = new HashSet<>();
		boolean flag = false;
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			if(h.add(c)) {
				flag = true;
			}else {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("unique char");
		} else {
			System.out.println("unique not  char");
		}
	}
	
	 public void hset(String s) {
		 HashSet<Character> h = new HashSet<>();
		 for(int i=0; i<s.length(); i++) {
				char c = s.charAt(i);
				System.out.println(h.add(c));
		 }
		 
		 System.out.println(" haset ==================="+h.toString());
	 }
	 
	 public void checkVowel(String str) {
		boolean f =  str.toLowerCase().matches(".*[auiou].*");
		if(f) {
			System.out.println(" vovwel present ......");
		}else {
			System.out.println("Vowel not present");
		}
	 }
	 
	 public void checkPrime(String str) {
		 int n = Integer.parseInt(str);
		 boolean flag = true;
		 if(n==0 || n ==1 ) {
			 System.out.println(n + "  is Not a Prime ");
		 }
		 if(n == 2 ) {
			 System.out.println(n + "  is Prime ");
		 }else {
		 
		 for(int i = 2; i<= n/2 ; i++ ) {
			 if( n % i == 0) {
				 flag = false;
			 }
		    }
		 if(flag) {
			 System.out.println(n + "  is Prime ");
		 } else {
			 System.out.println(n + "  is not Prime ");
		 }
		 }
		 
		 
	 }
	 
	 public void checkOdd() {
		 ArrayList<Integer> list = new ArrayList<>();
		 list.add(101);
		 list.add(14);
		 list.add(16);
		 
		boolean f = list.stream().anyMatch(x -> x % 2 != 0 );
		 if(f) {
			  System.out.println("The given number is   Odd " + f );
		 }else {
			 System.out.println("The given number is   Even ");
		 }
		
	 }
	 

}
