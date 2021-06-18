package com.bk.gen;

public class Stack1 {
	
	 int top;
	 int st[];
	 
	 Stack1() {
		 top = -1;
		 st = new int[10];
	 }
	 
	 public void push(int value) {
		 st[++top] = value;
	 }
	 
	 public int pop() {
		 return st[top--];
	 }
	
	public int peek() {
		return st[top];
	}
	
	public static void main(String args[]) {
		Stack1 s = new Stack1();
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s.pop());
		System.out.println(s.peek());
		
	}

}
