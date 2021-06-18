package com.bk.ll;


public class MyLinkedList<E> {
	
	@SuppressWarnings("unused")
	private class Node {
		E data;
		Node next;
		
		@SuppressWarnings("unused")
		Node(E data) {
			this.data = data;
		}
		
		Node(E data, Node next) {
			this.data = data;
			this.next = next;
		}
			
	}

	private Node head;
	private int size;
	
	public MyLinkedList() {
		 head = null;
		 size = 0;
	}
	
	public boolean add(E data) {
	
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
	
	public E get(int index) {
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
	
	public void addFirst(E data) {
		Node cur = new Node(data);
		if(head == null) {
			head = cur;
		}else {
			cur.next = head;
			head = cur;
		}
		size++;
	}
	
	public void removeFirst() {
		Node node = head;
		if(node == null) {
			return;
		}
		head = node.next;
		size--;
	}
	
	public void remove(int index) {
		if(index < 0 && index >= size) {
			throw new ArrayIndexOutOfBoundsException();
		}
		if(index==0) {
			head = head.next;
		}else {
			Node cur = getNode(index);
			Node pre = getNode(index-1);
			pre.next = cur.next;
		}
		size--;
	}
	
    
	 public String toArray() {
		 String str ="";
		 for(Node node =head; node != null; node = node.next) {
			  Object object = node.data;
			  str = str + object.toString() + "->";
		 }
		 return str+null;
	 }
	 
	 public Node reverseLinkedList() {
		  Node cur = head;
		  Node pre = null;
		  while(cur != null) {
			  Node temp = cur.next;
			  cur.next = pre;
			  pre = cur;
			  cur = temp;
		  }
		  head = pre;
		  return null;
	 }
	 
	 
	
	public static void main(String[] args) {
		
		MyLinkedList<Integer> list = new MyLinkedList<>();
	    list.add(10);
	    list.add(20);
	    list.add(30);
	    list.add(40);
	    list.add(50);
	    list.add(60);
	    //add first
	    System.out.println(list.toArray());
	    System.out.println(list.get(3));
	    System.out.println("After add first called");
	    list.addFirst(5);
	    System.out.println(list.toArray());
	    System.out.println("After  first remove called");
	    list.removeFirst();
	    System.out.println(list.toArray());
	    System.out.println("After remove called");
	    list.remove(3);
	    System.out.println(list.toArray());
	    list.reverseLinkedList();
	    System.out.println("after reverse ============");
	    System.out.println(list.toArray());
	    
		
	}

}
