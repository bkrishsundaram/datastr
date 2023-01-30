package com.bk.book.tree;

public class StackRevSt {

	public static void main(String[] args) {
		String str = "Balakrishnan";
		StackRevSt1 s = new StackRevSt1(str.length());
		s.pushch(str);
		System.out.println(s.disp());
		
	}

}

 class StackRevSt1{
	 
	 private int maxsize;
	 int top ;
	 char array[];
	 
	 public StackRevSt1(int size) {
		 maxsize = size;
		 array = new char[maxsize];
		 top = -1;
	 }
	 
	 public void push(char ch) {
		 array[++top] = ch;
	 }
	 
	 public char pop(){
		 return array[top--];
	 }
	 
	 public boolean isEmpty() {
		 return (top == -1);
	 }
	 
	 
	 public void pushch(String str) {
		 
		 for(int i=0; i<str.length(); i++) {
			 char ch = str.charAt(i);
			 push(ch);
		 }
	 }
	 
	 public String disp() {
		 String out="";
		 while(!isEmpty()) {
			 out = out+pop();
		 }
		 return out;
	 }
	 
	 
 }
