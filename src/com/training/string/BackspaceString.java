package com.training.string;
import java.util.Stack;

public class BackspaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "a#c", t = "b";

		boolean o = backspaceCompare(s, t);

		System.out.println(o);
	}

	private static boolean backspaceCompare(String s, String t) {
		// TODO Auto-generated method stub

		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();
		int p1 = sArray.length - 1;
		int p2 = tArray.length - 1;

		
		while (p1 >= 0 || p2 >=0) {
			if (sArray[p1] == '#' || tArray[p2] == '#') {
				return false;
			}
			else
			{
				
			}
		}

		return false;
	}

}
