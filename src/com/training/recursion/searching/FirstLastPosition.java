package com.training.recursion.searching;

public class FirstLastPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int output = binarySearch(input, 0, input.length - 1, 4);
		System.out.println(output);

		int input2[] = {0,0,1,2,2};
		int output2[] = getStartAndEndIndex(input2, 2);
		System.out.println(output2[0] +" "+ output2[1]);

	}

	private static int[] getStartAndEndIndex(int[] input, int i) {

		if (input.length == 0)
			return new int[] { -1, -1 };

		int firstPos = binarySearch(input, 0, input.length - 1, i);

		if (firstPos == -1)
			return new int[] { -1, -1 };

		int startPos = firstPos;
		int endPos = firstPos;
		int temp1 = -1, temp2 = -1;

		while (startPos != -1) {
			temp1 = startPos;
			startPos = binarySearch(input, 0, startPos - 1, i);
		}
		startPos = temp1;

		while (endPos != -1) {
			temp2 = endPos;
			endPos = binarySearch(input, endPos + 1, input.length - 1, i);
		}

		endPos = temp2;

		return new int[] { startPos, endPos };
	}

	public static int binarySearch(int[] input, int left, int right, int i) {

		while (left <= right) {
			int mid = (left + right) / 2;
			int valueToFound = input[mid];
			if (valueToFound == i) {
				return mid;
			} else if (valueToFound < i) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return -1;
	}

}
