package com.training.doublylinklist;

public class FlattenDoublyLinkedList {

	Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FlattenDoublyLinkedList linkedList = new FlattenDoublyLinkedList();
		linkedList.head = new Node(1);
		linkedList.head.next = new Node(2);
		linkedList.head.next.prev = linkedList.head;
		

	}

}

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
    
   public Node(int val)
   {
	   this.val = val;
	   this.next = null;
	   this.prev = null;
   }
};
