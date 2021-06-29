package com.bk.gg.mm;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
	
    /* Two sum  in binary tree  */
	public boolean findTarget(TreeNode root, int k) {
		
		List<Integer> list = new ArrayList<>();
		inorder(root, list);
		int l=0, r = list.size() -1;
		while( l < r) {
			int sum = list.get(l) + list.get(r);
			if(sum == k) {
	            System.out.println(list.get(l) + "  " + list.get(r));
				return true;
			}
			if(sum < k) {
				l++;
			}else {
				r--;
			}
			
		}
		
		return false;
	}
	
	
	public void inorder(TreeNode root, List<Integer> list) {
		if(root == null) {
			return ;
		}
		inorder(root.left, list);
		list.add(root.val);
		inorder(root.right,list);
	}
	
	TreeNode root;
	
	public TwoSum() {
		root = null;
	}
	
	public void insert(int val) {
		TreeNode node = new TreeNode(val);
		if(root == null) {
			root = node;
		}else {
			TreeNode current = root;
		    TreeNode parent = null;
		    while(true) {
		    	parent = current;
		    	if(current.val < val) {
		    		current = current.left;
		    		if(current == null ) {
		    			parent.left = node;
		    			return;
		    		}
		    	}else {
		    	 current = current.right;
		    	 if(current == null) {
		    		 parent.right = node;
		    		 return;
		    	 }
		    	}
		    } //while
		}
		
		
	}
	
	
	/*  longest path -  Depth-first Search */
	int diameter = 0;
	
	public int diamterOfBinaryTree(TreeNode node) {
		int res = longestPath(node);
		System.out.println("res =============" +res);
		return diameter;
	}
	
	public int longestPath(TreeNode node) {
		if(node == null) {
			return 0;
		}
		
		int leftPath = longestPath(node.left);
		int rightPath = longestPath(node.right);
		
		diameter = Math.max(diameter, leftPath+rightPath);
		
		return Math.max(leftPath, rightPath) +1 ;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		TwoSum t = new TwoSum();
		//5,3,6,2,4,null,7], k = 9
		t.insert(5);
		t.insert(3);
		t.insert(6);
		t.insert(2);
		t.insert(4);
		t.insert(7);

		//System.out.println(t.findTarget(t.root, 9));
		
		System.out.println(t.diamterOfBinaryTree(t.root));
		
		
	}

}
