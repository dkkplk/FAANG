package com.training.recursion.searching;

public class BinarySearchDemo {

	public static void main(String[] args) {

		int input[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int output = binarySearch(input, 5);
		System.out.println("Index is " + output);

	}

	public static int binarySearch(int[] input, int key) {

		int start = 0;
		int end = input.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			int valueFound = input[mid];

			if (valueFound == key) {
				return mid;
			} else if (mid < key) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}

		return -1;
	}

}
