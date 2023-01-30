package com.bk.book.tree;


public class Stac {

  public static void main(String args[]) {	
	Stac1 s = new Stac1(10);
	s.push(10);
	s.push(20);
	s.push(30);
	System.out.println(s.peek());
	System.out.println(s.pop());
	System.out.println(s.peek());
	
  }
	
	
}


class Stac1 {
	
	private int maxSize;
	private long array[];
	private int top;
	
	public Stac1(int size) {
		this.maxSize = size;
		top = -1;
		array = new long[maxSize];
	}
	
  public void push(long j) {
	  array[++top] = j;
  }
  
  public long pop() {
	  return array[top--];
  }
	
  public long peek() {
	  return array[top];
  }
  
  public boolean isEmpty() {
	  return (top == -1);
  }
  public boolean isFull() {
	  return (top == maxSize-1);
  }
  
}
