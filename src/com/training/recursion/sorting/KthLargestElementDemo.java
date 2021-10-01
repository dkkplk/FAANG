package com.training.recursion.sorting;

public class KthLargestElementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[] = {3,2,3,1,2,4,5,5,6 };
		int k = input.length - 4;
		int output = quickSelect(input, 0, input.length - 1, k);
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}

		System.out.println(output);
	}

	public static int quickSelect(int[] input, int i, int j, int k) {

		int partitionIndex = partion(input, i, j);

		if (partitionIndex == k) {
			return input[partitionIndex];
		} else if (k < partitionIndex) {
			return quickSelect(input, i, partitionIndex - 1, k);
		} else {
			return quickSelect(input, partitionIndex + 1, j, k);
		}

	}

	public static int partion(int[] input, int left, int right) {

		int pivotElement = input[right];
		int partitionIndex = left;
		for (int j = left; j < right; j++) {
			if (input[j] < pivotElement) {
				swap(input, partitionIndex, j);
				partitionIndex++;
			}
		}
		swap(input, partitionIndex, right);
		return partitionIndex;
	}

	public static void swap(int[] input, int partitionIndex, int j) {
		int temp = input[j];
		input[j] = input[partitionIndex];
		input[partitionIndex] = temp;

	}

}
