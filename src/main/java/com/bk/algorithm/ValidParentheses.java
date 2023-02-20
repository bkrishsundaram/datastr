package com.bk.algorithm;

import java.util.Stack;

public class ValidParentheses {
	
	
	 public boolean isValid(String s) {
		 
		 Stack<Character> stack = new Stack<>();
		 
		 for (char ch : s.toCharArray()) {
			 
			 switch(ch) {
			 case '(':
			 case  '{':
			 case '[':
				 stack.push(ch);
				 break;
			 case ')':
				 if(stack.isEmpty() || stack.pop() != '(') {
					 return false;
				 }
			     break;
		 case '}':
			 if(stack.isEmpty() || stack.pop() != '{') {
				 return false;
			 }
		     break;
	 case ']':
		 if(stack.isEmpty() || stack.pop() != '[') {
			 return false;
		 }
	      break;
		 }
 	}
		 
		 return stack.isEmpty();
		 
		 
	 }
	
	

	public static void main(String[] args) {
		ValidParentheses v = new ValidParentheses();
		String str = "(coder)(byte)";
		System.out.println(v.isValid(str));

	}

}
