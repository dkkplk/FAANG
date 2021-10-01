package com.training.linklist;

import java.util.LinkedList;

public class ReverseLinkList {

	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseLinkList linkList = new ReverseLinkList();
		linkList.head = new Node(10);
		linkList.head.next = new Node(20);
		linkList.head.next.next = new Node(30);
		linkList.head.next.next.next = new Node(40);

		printLinkList(linkList);

		reverseLinkList(linkList);

		System.out.println();
		printLinkList(linkList);

	}

	private static void reverseLinkList(ReverseLinkList linkList) {
		Node prev, curr, next;
		prev = next = null;
		curr = linkList.head;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;

		}
		
		head = prev;

	}

	private static void printLinkList(ReverseLinkList linkList) {
		// TODO Auto-generated method stub
		Node printHead = linkList.head;
		if (printHead == null)
			return;

		while (printHead != null) {
			System.out.print(printHead.data + "->");
			printHead = printHead.next;

		}
	}

}
