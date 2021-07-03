package com.bk.ll;

public class LinkList {
  
	  class Node {
		  int data;
		  Node next;
		  
		  public Node(int data) {
			  this.data = data;
			  next = null;
		  }
	  }
	  
	  
	  private Node head;
	  
	  public LinkList() {
		  head = null;
	  }
	  
	  public void insertEnd(int data) {
		  
		  Node cur = new Node(data);
		  
		  if(head == null) {
			  head = cur;
		  } else {
             Node n = head;
             while(n.next != null) {
            	 n = n.next;
             }
             n.next =  cur;
		  }
	  }
	  
	  public void remoce(int data) {
		  Node node = head;
		  if(node == null) {
			  return;
		  }
		  if(node.data == data) {
			  head = node.next;
		  }else {
			  while(node.next != null) {
				  if(node.next.data == data) {
					  node.next = node.next.next;
					  return;
				  }
				  node = node.next;
			  }
		  }
		  
	  }
	  
	  
	
	
	public static void main(String[] args) {

	}

}
