package com.bk.ll;

 
public class AddTwoLinkedList {
	
	private class Node {
		int data;
		Node next;
		
		@SuppressWarnings("unused")
		Node(int data) {
			this.data = data;
		}
		
		@SuppressWarnings("unused")
		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
			
	}
	
	private Node head;
	private int size;
	
	public AddTwoLinkedList() {
		 head = null;
		 size = 0;
	}
	
	public boolean add(int data) {
		
		Node cur = new Node(data);
		if(head == null) {
			head = cur;
		}else {
			Node node = head;
			while(node.next != null) {
				node = node.next;
			}
			node.next = cur;
			size++;
		}
		
		return true;
	}
	
	public int get(int index) {
		Node node = getNode(index);
		return node.data;
	}
	
	private Node getNode(int index) {
		if(index < 0 && index >= size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		Node node = head;
		for(int i=0; i < index; i++) {
			 node = node.next;
		}
		return node;
	}
	
	
	public void display() {
		Node cur = head;
		
		while(cur != null) {
			System.out.print(cur.data+"==>");
			cur = cur.next;
		}
		
		System.out.println();
	}
	
	
	
	/*
	You are given two non-empty linked lists representing two non-negative integers.
	 The digits are stored in reverse order, and each of their nodes contains a single digit. 
	 Add the two numbers and return the sum as a linked list.
      You may assume the two numbers do not contain any leading zero, except the number 0 itself.
	*/
	public Node addlinkedList(Node l1, Node l2) {
		Node dummy = new Node(0);
		Node p = l1;
		Node q = l2;
		Node cur = dummy;
		int carry = 0;
		
		while( p!= null || q != null) {
			int x = (p != null) ? p.data : 0;
			int y = (q != null) ? q.data : 0;
			int sum = carry + x + y;
		    carry = sum /10;
		    cur.next = new Node(sum % 10);
		    cur = cur.next;
		    if( p != null ) p =p.next;
		    if(q != null) q = q.next;
		}
		return dummy.next;
	}
	
	/*
	Merge two sorted linked lists and return it as a sorted list. 
	The list should be made by splicing together the nodes of the first two lists.
	*/
	public Node mergeNode(Node l1,Node l2) {
		Node prehead = new Node(-1);
		Node pre = prehead;
		
		while(l1 != null && l2 != null) {
			if(l1.data < l2.data) {
				pre.next = l1;
				l1 = l1.next;
			}else {
				pre.next = l2;
				l2 = l2.next;
			}
			pre = pre.next;
		}
		
		 pre.next = l1 == null ? l2 : l1;

		 return prehead.next;
		
	}
	/*
	Given the head of a linked list, remove the nth node from the end of the list and return its head.
	*/
	public Node removeFromEnd(int n) {
		Node dummy = new Node(0);
		dummy.next  = head;
		Node first = dummy.next;
		Node second = dummy;
		for(int i=0; i<n; i++) {
			first = first.next;
		}
		
		while(first != null) {
			first = first.next;
			second = second.next;
		}
		second.next = second.next.next;
		
		return dummy.next;
	}
	
	/*
	Given the head of a linked list, remove the nth node from the end of the list and return its head.
	*/
	public Node removeFromEnd1(int n) {
		Node first = head.next;
		Node second = head;
		for(int i=0; i < n; i++) {
			first = first.next;
		}
		
		while(first != null) {
			first = first.next;
			second = second.next;
		}
		second.next = second.next.next;
		
		return  head;
	}
	
	public void display(Node curhead) {
		Node cur = curhead;
		
		while(cur != null) {
			System.out.print(cur.data+"==>");
			cur = cur.next;
		}
		
		System.out.println();
	}
	

	public static void main(String[] args) {
		  
		AddTwoLinkedList a = new AddTwoLinkedList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(80);
		a.add(90);
		
		//a.display();
		//System.out.println("after removal");
		//Node curhead = a.removeFromEnd(3);
		//a.display(curhead);

		AddTwoLinkedList m1 = new AddTwoLinkedList();
		AddTwoLinkedList m2 = new AddTwoLinkedList();
		a.callMergeNode(m1,m2);  
		
	}
	
	public void callMergeNode(AddTwoLinkedList m1, AddTwoLinkedList m2) {
		m1.add(1);
		m1.add(2);
		m1.add(4);
		
		m2.add(1);
		m2.add(3);
		m2.add(4);
		
	   Node curhead =	mergeNode(m1.head,m2.head);
	   display(curhead);
	}

}
