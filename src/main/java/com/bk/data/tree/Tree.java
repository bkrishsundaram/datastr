package com.bk.data.tree;

public class Tree {

	 private Node root;
	 
	 public Tree() {
		 root = null;
	 }
	 
	 
	 public Node find(int key) {
		 Node current  = root;
		 while(current.data != key) {
			 if(key < current.data) {
				 current = current.leftChild;
			 }else {
				 current = current.rightChild;
			 }
			 if(current == null) {
				 return null;
			 }
		 }
		 return current;
	 }
	 
	 public void insert(int id) {
		 Node newNode = new Node(id);
		 if(root == null) {
			 root = newNode;
		 }else {
			 
			 Node current = root;
			 Node parent;
			 while(true) {
				 parent = current;
				 if(id < current.data) {
					 current = current.leftChild;
					 if(current == null) {
						 parent.leftChild =newNode;
						return;
					 }
				 }else {
					 current = parent.rightChild;
				 }
				 if(current == null) {
					 parent.rightChild = newNode;
					 return;
				 }
			 }
		 }
		 
	 }
	 
	 public int getMaxsum(Node root) {
		 if (root == null) {
			 return 0;
		 }
		 
		 int leftsum = Math.max(0,getMaxsum(root.leftChild));
		 int rightsum = Math.max(0, getMaxsum(root.rightChild));
		 return  Math.max(leftsum, rightsum) + root.data;
		 
		 
	 }
 	 
}
