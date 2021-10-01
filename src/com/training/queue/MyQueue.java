package com.training.queue;

import java.util.Stack;

class MyQueue {
	Stack<Integer> in;
	Stack<Integer> out;

	/** Initialize your data structure here. */
	public MyQueue() {
		in = new Stack<>();
		out = new Stack<>();
	}

	/** Push element x to the back of queue. */
	public void push(int x) {

		in.push(x);
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {

		if (out.size() == 0) {
			while (in.size() > 0) {
				out.push(in.pop());
			}
		}
		return out.pop();
	}

	/** Get the front element. */
	public int peek() {
		if(out.size() == 0)
		{
			while(in.size() > 0)
			{
				out.push(in.pop());
			}
		}
		
		return out.get(out.size()-1);
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {

		return in.size() == 0 && out.size() == 0;
	}
}
