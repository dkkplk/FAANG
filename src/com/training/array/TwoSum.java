package com.training.array;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] inputArray = {15,1, 3, 7, 9, 2};
		int sum = 9;

		int[] output = findTwoSum(inputArray, sum);
		for (int i : output) {
			System.out.println(i);
		}

	}

	private static int[] findTwoSum(int[] inputArray, int sum) {

		Map<Integer, Integer> valueStore = new HashMap<>();

		if (inputArray.length <= 0 || sum <= 0)
			return null;

		for (int i = 0; i < inputArray.length; i++) {

			int numToFind = sum - inputArray[i];

			if (valueStore.containsKey(numToFind)) {

				return new int[] { valueStore.get(numToFind), i };

			} else {

				valueStore.put(inputArray[i], i);
			}
		}

		return new int[] {};
	}

}
