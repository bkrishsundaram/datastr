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
}
