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

		 return pre;
		
	}

	public static void main(String[] args) {
		 

	}

}
