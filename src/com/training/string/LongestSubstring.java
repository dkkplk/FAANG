package com.training.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

	public static void main(String args[]) {
		String s = "bbbb";

		int output = lengthOfLongestSubstring(s);

		System.out.println(output);

	}

	private static int lengthOfLongestSubstring(String s) {

		if (s.length() <= 0)
			return s.length();

		Map<Character, Integer> charStore = new HashMap<>();
		int left = 0, longest = 0;

		for (int right = 0; right < s.length(); right++) {
			char currentChar = s.charAt(right);

			if (charStore.containsKey(currentChar) && charStore.get(currentChar) >= left) {
				left = charStore.get(currentChar) + 1;
			}

			charStore.put(currentChar, right);
			longest = Math.max(longest, (right - left) + 1);
		}

		return longest;
	}

}
