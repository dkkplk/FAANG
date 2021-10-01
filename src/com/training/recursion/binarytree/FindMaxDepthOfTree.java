package com.training.recursion.binarytree;

public class FindMaxDepthOfTree {

	TreeNode node;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindMaxDepthOfTree depth = new FindMaxDepthOfTree();
		
		depth.node = new TreeNode(3);
		depth.node.left = new TreeNode(9);
		depth.node.right = new TreeNode(20);
		
		depth.node.right.left = new TreeNode(15);
		depth.node.right.right = new TreeNode(7);
		
		int output = findMaxDepth(depth.node);
		
		System.out.println(output);
		
	}


	private static int findMaxDepth(TreeNode node) {
		
		return maxDepth(node,0);
	}


	private static int maxDepth(TreeNode node, int i) {
		
		if(node == null)
		{
			return i;
		}
		i++;
		
		return Math.max(maxDepth(node.left,i), maxDepth(node.right, i));
			
	}

}
