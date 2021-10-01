package com.training.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidateParanthesesStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "()[]{}";
		boolean output = isValid(input);
		System.out.println(output);
	}

	private static boolean isValid(String input) {

		Stack<Character> stack = new Stack<Character>();
		Map<Character, Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');

		for (char i : input.toCharArray()) {

			if (map.containsKey(i)) {
				stack.push(map.get(i));
			} else {
				if (stack.isEmpty() || stack.pop() != i) {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}

}
