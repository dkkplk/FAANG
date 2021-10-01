package com.training.string;

public class ValidPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "A man, a plan, a canal: Panama";
		boolean output = isValidPlaindrom(input);
		System.out.println(output);
	}

	private static boolean isValidPlaindrom(String input) {

		input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		int left = 0, right = input.length() - 1;

		while (left < right) {
			if (input.charAt(left) != input.charAt(right)) {
				return isSubPlaindrom(input, left + 1, right) || isSubPlaindrom(input, left, right - 1);
			}

			left++;
			right--;
		}

		return true;
	}

	public static boolean isSubPlaindrom(String input, int left, int right) {

		while (left < right) {
			if (input.charAt(left) != input.charAt(right)) {
				return false;
			}

			left++;
			right--;
		}

		return true;
	}

}
