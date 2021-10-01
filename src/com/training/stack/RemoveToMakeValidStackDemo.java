package com.training.stack;

import java.util.Stack;

public class RemoveToMakeValidStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = ")le))e(t(c)o)de)";
		String output = minRemoveToMakeValid(input);
		System.out.println(output);
	}

	private static String minRemoveToMakeValid(String s) {

		char[] chars = s.toCharArray();
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '(') {
				stack.push(i);
			} else if (chars[i] == ')' && stack.size() > 0) {
				stack.pop();
			} else if (chars[i] == ')') {
				chars[i] = ' ';
			}

		}

		while (stack.size() > 0) {
			int currIndex = stack.pop();
			chars[currIndex] = ' ';
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(char c : chars)
		{
			if(c != ' ')
				sb.append(c);
		}

		return sb.toString();
	}

}
