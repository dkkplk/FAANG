package com.training.recursion.sorting;

public class QuickSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[] = { 5, 3, 1, 6, 4, 2 };
		int left = 0;
		int right = input.length - 1;
		quickSort(input, left, right);

		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}

	}

	public static void quickSort(int[] input, int left, int right) {
		if (left < right) {
			int partitionIndex = partition(input, left, right);
			quickSort(input, left, partitionIndex - 1);
			quickSort(input, partitionIndex + 1, right);
		}

	}

	public static int partition(int[] input, int left, int right) {
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

		int temp = input[partitionIndex];
		input[partitionIndex] = input[j];
		input[j] = temp;

	}

}
