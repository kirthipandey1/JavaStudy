package com.learn.dsa.recursion;

public class Test2 {
	
	public static int height(Tree tree) {
		if(tree==null) return 0;
		int left = height(tree.left);
		int right = height(tree.right);
		return 1+Math.max(left, right);
	}

	public static void main(String[] args) {
		
		Tree tree = new Tree(1);
		tree.left = new Tree(2);
		tree.right = new Tree(3);
		tree.left.left = new Tree(4);
		tree.left.right = new Tree(5);
		tree.right.left = new Tree(6);
		tree.right.right = new Tree(7);
		tree.left.left.right = new Tree(8);
		System.out.println(height(tree));
	}

}
