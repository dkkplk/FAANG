package com.training.recursion.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

	TreeNode node;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LevelOrderTraversal depth = new LevelOrderTraversal();

		depth.node = new TreeNode(3);
		depth.node.left = new TreeNode(9);
		depth.node.right = new TreeNode(20);

		depth.node.right.left = new TreeNode(15);
		depth.node.right.right = new TreeNode(7);

		List<List<Integer>> output = getLevelOrder(depth.node);
		System.out.println(output);
		for (List<Integer> l : output) {
			System.out.println(l);
		}
	}

	private static List<List<Integer>> getLevelOrder(TreeNode root) {
		List<List<Integer>> output = new ArrayList<>();
		if (root == null) {
			return output;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> currentLevel = new ArrayList<Integer>();
			for (int i = 0; i < size; i++) {
				TreeNode current = queue.remove();
				currentLevel.add(current.data);

				if (current.left != null) {
					queue.add(current.left);
				}
				if (current.right != null) {
					queue.add(current.right);
				}
			}

			output.add(currentLevel);
		}

		return output;
	}

}
