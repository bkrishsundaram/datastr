package com.bk.gen;

public class Queue {
     int top;
     int first;
     int st[];
     
     public Queue() {
    	 top = -1;
    	 first =0;
    	 st = new int[10];
     }
	 
     public void push(int value) {
    	 st[++top] = value;
     }
     
     public int remove() {
    	 return st[first++];
     }
     
     
	
	
	public static void main(String[] args) {

		Queue q = new Queue();
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
		System.out.println(q.remove());
		System.out.println(q.remove());
		
	}

}
