package com.bridgelabz.linkedlist;

public class Test {
	public static void main(String[] args) {
		System.out.println("Welcome to LinkedList Program.");
		LinkedList linkedlist = new LinkedList();
		Node myFirstNode = new Node(70);
		Node mySecondNode = new Node(30);
		Node myThirdNode = new Node(56);
		linkedlist.addBefore(myFirstNode);
		linkedlist.addBefore(mySecondNode);
		linkedlist.addBefore(myThirdNode);
		linkedlist.printNode();

		boolean result = linkedlist.head.equals(myThirdNode) && linkedlist.head.getNext().equals(mySecondNode)
				&& linkedlist.tail.equals(myFirstNode);
		System.out.print(result);

	}
}