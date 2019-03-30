package com.regnant.ds;

public class DoubleLinkedListExercise {

	Node head = null, current = null;

	void push(int data) {
		Node n = new Node();
		n.data = data;
		if (head == null) {
			head = n;
			current = n;
		} else {
			n.prevnode = current;
			current.nextnode = n;
			current = n;
		}
	}

	void pop() {
		Node n = head;
		head = n.nextnode;
		head.prevnode = null;
	}

	void pop1() {
		Node n = current;
		current = n.prevnode;
		current.nextnode = null;
	}

	void revDisplay() {
		Node n = current;
		while (n != null) {
			System.out.print(" " + n.data);
			n = n.prevnode;
		}
	}

	void display() {
		Node n = head;
		while (n != null) {
			System.out.print(" " + n.data);
			n = n.nextnode;
		}
	}
}
