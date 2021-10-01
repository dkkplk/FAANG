package com.training.array;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int output = findTrapWater(height);
		System.out.println(output);

	}

	private static int findTrapWater(int[] height) {
		int left = 0, right = height.length - 1, leftMax = 0, rightMax = 0, totalWater = 0;

		while (left < right) {
			if (height[left] <= height[right]) {
				if (height[left] >= leftMax) {
					leftMax = height[left];
				} else {
					totalWater += leftMax - height[left];
				}
				left++;
			} else {
				if (height[right] >= rightMax) {
					rightMax = height[right];
				} else {
					totalWater += rightMax - height[right];
				}
				right--;
			}

		}
		return totalWater;
	}

}
