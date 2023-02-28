package com.bk.top.str;

import java.util.Stack;

/*
 * Have the function BracketMatcher(str) take the str parameter being passed and return 1 if 
 * the brackets are correctly matched and each one is accounted for. Otherwise return 0. 
 * For example: if str is "(hello (world))", then the output should be 1, but if str is "((hello (world))"
 *  the the output should be 0 because the brackets do not correctly match up. Only "(" and ")"
 *   will be used as brackets. If str contains no brackets return 1.
 */

public class BracketMatcher {
	
	public static String bracketMatcher(String str) {
	    
		String temp = "";
		for(int i=0; i< str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == '(' || ch==')') {
				temp = temp + String.valueOf(ch);
			}
		}
		
		int count = 0;
		int mismatch = 0;
		for(int i=0; i<temp.length(); i++) {
			char ch = temp.charAt(i);
			if (ch=='(') {
				count++;
			} else {
				if (count > 0) {
					count--;
				} else {
					mismatch++;
				}
			}
		}
		
		if ((mismatch+count) == 0) {
			return "1";
		} else {
			return "0";
		}
	    
	  }
	
	
	public static String anotherSol(String str) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i< str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch=='(') {
				stack.push(ch);
			} else if (ch==')') {
				if(stack.isEmpty()) {
					return "0";
				}else {
					stack.pop();
				}
			}
			
		}
		
		 
		
		return stack.isEmpty() ? "1" : "0";
	}

	public static void main(String[] args) {
	 
		String str = "(c(oder)) b(yte)";
		System.out.println(BracketMatcher.bracketMatcher(str));
		System.out.println(BracketMatcher.anotherSol(str));
		str.matches("");

	}

}
