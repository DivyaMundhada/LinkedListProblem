package com.bridgelabz.linkedlist;

public class LinkedList {
	public Node head;
	public Node tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void addBefore(Node newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			Node tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}

	}

	public void printNode() {
		StringBuffer Node = new StringBuffer("My Nodes: ");
		Node tempNode = head;
		while (tempNode.getNext() != null) {
			Node.append(tempNode.getData());
			if (!tempNode.equals(tail))
				Node.append("->");
			tempNode = tempNode.getNext();
		}
		Node.append(tempNode.getData());
		System.out.println(Node);
	}
}
