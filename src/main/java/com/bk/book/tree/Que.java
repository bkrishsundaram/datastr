package com.bk.book.tree;


public class Que {

	public static void main(String[] args) {

		Que1 q = new Que1(5);
		q.insert(10);
		q.insert(20);
		q.insert(30);
		
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println("==========="+q.peekfront());
	}

}

class Que1{
	
	int maxsize;
	int array[];
	int front;
	int rear;
	private int nItems;
	
	public Que1(int size) {
		maxsize = size;
		array = new int [maxsize];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insert(int i) {
		if(rear == maxsize-1) {
			rear = -1;
		}
		array[++rear] = i;
		nItems++;
	}
	
	public int remove() {
		int temp = array[front++];
		if(front == maxsize) {
			front = 0;
		}
		nItems--;
		return temp;
	}
	
	public int peekfront() {
		return array[front];
	}
	
}
