package com.bk.book.tree;

public class Node {
	int iData;
	Node leftChild;
	Node rightChild;
	
	public Node(int iData) {
		this.iData = iData;
	}
	
	public Node() {
		iData = 0;
		leftChild = null;
		rightChild = null;
	}
	
	public void display() {
		System.out.println("data === "+iData);
	}
	
}
