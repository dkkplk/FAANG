package com.training.recursion;

public class FactorialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long input = 5;
		long output = findFactorial(input, 1);
		System.out.println(output);
	}

	public static long findFactorial(long input, long a) {

		if (input == 0)
			return a;

		return findFactorial((input - 1), (input * a));
	}

}
