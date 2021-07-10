package com.bridgelabz.linkedlist;

public class Test {
	public static void main(String[] args) {
		System.out.println("Welcome to LinkedList Program.");
		LinkedList linkedlist = new LinkedList();
		Node myFirstNode = new Node(56);
		Node mySecondNode = new Node(30);
		Node myThirdNode = new Node(70);
		linkedlist.addBefore(myFirstNode);
		linkedlist.appendAfter(mySecondNode);
		linkedlist.appendAfter(myThirdNode);
		linkedlist.printNode();

		boolean result = linkedlist.head.equals(myFirstNode) && linkedlist.head.getNext().equals(mySecondNode)
				&& linkedlist.tail.equals(myThirdNode);
		System.out.print(result);

	}
}