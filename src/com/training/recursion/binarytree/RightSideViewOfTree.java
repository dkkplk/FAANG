package com.training.recursion.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideViewOfTree {

	TreeNode root;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RightSideViewOfTree rightSideView = new RightSideViewOfTree();
		rightSideView.root = new TreeNode(1);
		rightSideView.root.left = new TreeNode(2);
		rightSideView.root.right = new TreeNode(3);

		rightSideView.root.left.left = new TreeNode(5);
		rightSideView.root.right.left = new TreeNode(4);

		// BFS Approach
		List<Integer> output = findValueFromRightSideView(rightSideView.root);
		System.out.println(output);

		// DFS preorder NRL (right priortize approch)

		List<Integer> output2 = findValueFromRight(rightSideView.root);
		System.out.println(output2);
	}

	private static List<Integer> findValueFromRight(TreeNode root) {
		List<Integer> output = new ArrayList<Integer>();
		depthFirstSearch(root, 0, output);
		return output;
	}

	private static void depthFirstSearch(TreeNode root, int count, List<Integer> output) {
		if (root == null) {
			return;
		}
		if (count >= output.size()) {
			output.add(root.data);
		}

		if (root.right != null) {
			depthFirstSearch(root.right, count + 1, output);
		}

		if (root.left != null) {
			depthFirstSearch(root.left, count + 1, output);
		}
	}

	// BFS approach
	private static List<Integer> findValueFromRightSideView(TreeNode root) {
		List<Integer> output = new ArrayList<Integer>();

		if (root == null) {
			return output;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			int size = queue.size();

			for (int i = 0; i < size; i++) {
				TreeNode current = queue.remove();
				if (i == size - 1) {
					output.add(current.data);
				}
				if (current.left != null) {
					queue.add(current.left);
				}
				if (current.right != null) {
					queue.add(current.right);
				}
			}
		}
		return output;
	}

}
