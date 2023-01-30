package com.bk.book.tree;

/*
public class SingleList {

	 Node1 head;
	 public SingleList() {
		 head = null;
	 }
	public static void main(String args[]) {
		
	}

	private Node1 getNode(int index) {
		Node1 cur = head;
		for(int i = 0; i < index && cur != null ; i++) {
			cur = cur.next;
		}
		return cur;
	}
	
	private Node1 getTail() {
		Node1 cur = head;
		while(cur != null && cur.next != null) {
			cur = cur.next;
		}
		return cur;
	}
	
	public int get(int index) {
		Node1 cur = getNode(index);
		return cur != null ? cur.val : -1; 
	}
	
	public void addAtHead(int val) {
		Node1 cur = new Node1(val);
		cur.next = head;
		head = cur;
	}
	
	public void addAtTail(int val) {
		if(head == null) {
			addAtHead(val);
			return ;
		}
		Node1 pre = getTail();
		Node1 cur = new Node1(val);
		pre.next = cur;
		
		
	}
	
	public void addAtIndex(int index, int val) {
		if(index == 0) {
			addAtHead(val);
			return ;
		}
		
		Node1 pre = getNode(index-1);
		if(pre == null) {
			return;
		}
		Node1 next = pre.next;
		Node1 cur = new Node1(val);
		pre.next = cur;
		cur.next = next;
		
	}
	
	public void deleteAtIndex(int index) {
		Node1 cur = getNode(index);
		if(cur == null) {
			return;
		}
		
		Node1 pre = getNode(index-1);
		Node1 next = cur.next;
		
	    if(pre != null) {
	    	pre.next = next;
	    } else {
	    	head = next;
	    }
		
	}
	
	
	
} 


class Node1 {
	int val;
	Node next;
	public Node1(int val) {
		this.val = val;
	}
}
	
	*/
	