package com.training.queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyQueue mq = new MyQueue();
		mq.push(1);
		mq.push(2);
		System.out.println(mq.peek());
		System.out.println(mq.pop());
		System.out.println(mq.empty());
	}

}
