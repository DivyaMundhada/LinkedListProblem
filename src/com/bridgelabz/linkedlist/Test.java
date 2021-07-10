package com.bridgelabz.linkedlist;

public class Test {
	public static void main(String[] args) {
		System.out.println("Welcome to LinkedList Program.");
		Node myFirstNode = new Node(56);
		Node mySecondNode = new Node(30);
		Node myThirdNode = new Node(50);
		myFirstNode.setNext(mySecondNode);
		mySecondNode.setNext(myThirdNode);

		boolean result = myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode);
		System.out.print(result);

	}
}