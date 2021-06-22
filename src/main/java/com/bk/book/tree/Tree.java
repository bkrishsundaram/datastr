package com.bk.book.tree;

public class Tree {
	
	private Node root;
	
	public Tree() {
		root = null;
	}
	
	public void insert(int id) {
     /* create a new Node*/
		Node newNode = new Node(id);
		if(root == null) {
			root = newNode;
		} else { /* roor is not null */
			Node current = root;
			Node parent = null;
			while(true) {
				parent = current;
				if(id < current.iData) { /* left child node */
					current = current.leftChild;
					if(current ==  null) {
						parent.leftChild = newNode;
						return;
					}
				}else { /* right child */
					current = current.rightChild;
					if(current == null) {
						parent.rightChild = newNode;
						return;
					}
							
				}
			}//end of while
			
		} // end of new node insert
		
	}
	
	
	public Node find(int key) {
		Node current = root;
		while(current.iData != key) {
			if(key < current.iData) {
				current = current.leftChild;
			} else {
				current = current.rightChild; 
			}
			if(current == null) {
				return null;
			}
		}
		return current;
	}
	
	public int min() {
		if(root == null) {
			return -1;
		}
		Node current = root;
		Node parent = current;
		while(current != null) {
		    parent = current;
			current = current.leftChild;
		}
		return parent.iData;
	}
	
	public int max() {
		if(root == null) {
			return -1;
		}
		Node current = root;
		Node parent = current;
		while(current != null) {
			parent = current;
			current = current.rightChild;
			
		}
		return parent.iData;
	}
	
	public boolean delete(int key) {
		Node current = root;
		Node parent = root;
		boolean isleftChild = true;
		while(current.iData != key) {
			parent = current;
			if(key < current.iData) {
		       isleftChild = true;
				current = current.leftChild;
			}else {                                                                                                                                                                                                                                                                                                                                       
				isleftChild = false;
				current = current.rightChild;
			}
			if(current == null) {
				return false;
			}
		} /*end of while */
		
		/* Deleting the leaf which has no left or right child */
		if(current.leftChild == null && current.rightChild == null) {
			if(current == root) {
				root = null;
			}else if (isleftChild) {
				parent.leftChild = null;
			}else {
				parent.rightChild = null;
			}
		}
		/* Node to be delete with one child */
		else if(current.leftChild == null) {
			if(current == root) {
				root = current.rightChild;
			}else if(isleftChild) {
				parent.leftChild = parent.rightChild;
			}else {
				parent.rightChild = parent.rightChild;
			}
		}
		/* Node to be delete with one child */
		else if(current.rightChild == null) {
			if(current == root) {
				root = current.leftChild;
			}else if(isleftChild) {
				parent.leftChild = parent.leftChild;
			}else {
				parent.leftChild = parent.rightChild;
			}
		}
		return true;
	}
	

}	
