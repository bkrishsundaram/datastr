package com.bk.gg.array;

import java.util.Stack;

public class validParen {

	public static void main(String[] args) {

		Stack<Character> stack = new Stack<>();
		
		String s = "((({}))))";
		
		
		for(Character c : s.toCharArray()) {
			if(c =='(' || c == '{' || c == '[') {
				stack.push(c);
				continue;
			}
			try {
				char d = stack.pop();
		        if(c=='(' && d ==')') {
		        	continue;
		        }if(c=='[' && d==']') {
		        	continue;
		        }if(c=='{' && c=='}') {
		        	continue;
		        }
		       // return ;
				
			}catch(Exception e) {
				System.out.println("false" +e);
			}
			
		} 
		  if(stack.size() > 0) {
			  System.out.println("false");
		  }else {
			  System.out.println("true");
		  }
		
	}

}
