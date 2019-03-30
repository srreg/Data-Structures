package com.regnant.ds;

public class CircularSingleLinkedListExercise {
	Node head = null, current = null;

	void push(int data) {
		Node n = new Node();
		n.data = data;
		if (head == null) {
			head = n;
			current = n;
		} else {
			current.nextnode = n;
			current = n;
			current.nextnode = head;
		}
	}

	void display() {
		Node n = head;
		while (head != n.nextnode) {
			System.out.println(n.data + " ");
			n = n.nextnode;
		}
		System.out.println(n.data);
	}
}
