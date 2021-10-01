package com.training.linklist;

public class MNReverseLinkList {

	Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MNReverseLinkList linkedList = new MNReverseLinkList();
		linkedList.head = new Node(1);
		linkedList.head.next = new Node(2);
		linkedList.head.next.next = new Node(3);
		linkedList.head.next.next.next = new Node(4);
		linkedList.head.next.next.next.next = new Node(5);

		printLinkedList(linkedList);
		Node newHead = mnReverseLinkList(linkedList.head, 2, 4);

		System.out.println();
		printLinkedList(newHead);

	}

	private static void printLinkedList(Node newHead) {
		Node curr = newHead;

		while (curr != null) {
			System.out.print(curr.data + "->");
			curr = curr.next;
		}

	}

	public static Node mnReverseLinkList(Node head, int left, int right) {

		if (right == 1)
			return null;

		int currentPos = 1;
		Node currentNode = head;
		Node start = head;

		while (currentPos < left) {
			start = currentNode;
			currentNode = currentNode.next;
			currentPos++;
		}

		Node newList = null;
		Node tail = currentNode;

		while (currentPos >= left && currentPos <= right) {
			Node next = currentNode.next;
			currentNode.next = newList;
			newList = currentNode;
			currentNode = next;
			currentPos++;
		}

		start.next = newList;
		tail.next = currentNode;

		if (left > 1) {
			return head;
		} else {
			return newList;
		}
	}

	public static void printLinkedList(MNReverseLinkList linkedList) {
		Node curr = linkedList.head;

		while (curr != null) {
			System.out.print(curr.data + "->");
			curr = curr.next;
		}
	}

}

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}
