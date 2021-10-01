package com.training.array;

public class MaximumWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] hightArray = { 2,3,4,5,18,17,6};

		int maxArea = getMaxArea(hightArray);
		System.out.println(maxArea);

	}

	private static int getMaxArea(int[] hightArray) {

		int p1 = 0;
		int p2 = hightArray.length - 1;
		int maxArea = 0;

		while (p1 < p2) {
			int hight = Math.min(hightArray[p1], hightArray[p2]);
			int width = p2 - p1;
			int area = hight * width;
			maxArea = Math.max(maxArea, area);

			if (hightArray[p1]<= hightArray[p2]) {
				p1++;
			} else {
				p2--;
			}
		}
		return maxArea;
	}

}
