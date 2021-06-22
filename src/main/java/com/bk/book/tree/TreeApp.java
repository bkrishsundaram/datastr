package com.bk.book.tree;

public class TreeApp {

	public static void main(String[] args) {
		 
		Tree tree = new Tree();
		
		tree.insert(50);
		tree.insert(25);
		tree.insert(75);
		tree.insert(12);
		tree.insert(37);
        tree.insert(43);
        tree.insert(30);
        tree.insert(33);
        
        int key = 30;
      
        Node node = tree.find(key);
        if(node != null) {
        	System.out.println(" Found == "+node.iData);
        }
        /*
        key =47;
        node = tree.find(key);
        if(node != null) {
        	System.out.println(" == "+node.iData);
        }else {
        	System.out.println(" Not found " +key);
        } */
        
        System.out.println("  Min ======" + tree.min());
        System.out.println("  Max ======" + tree.max());
        
	}

}
