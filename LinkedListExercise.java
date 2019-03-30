package com.regnant.ds;

public class LinkedListExercise {

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
		}
	}

	void remove(int element) {
		Node temp = null, n = head;
		while (n != null) {
			if (element == head.data) {
				head = n.nextnode;
			} else if (element == n.data) {
				temp.nextnode = n.nextnode;
			}
			temp = n;
			n = n.nextnode;
		}
		if (n == null) {
			current = temp;
		}
	}

	void removebyPosition(int pos) {
		Node temp = null, n = head;
		int p = 1;
		while (n != null) {
			if (pos == 1) {
				head = n.nextnode;
			} else if (pos == p) {
				temp.nextnode = n.nextnode;
			}
			temp = n;
			p++;
			n = n.nextnode;
		}
		if (n == null) {
			current = temp;
		}
	}

	int Size() {
		Node size = head;
		int count = 0;
		while (size != null) {
			count++;
			size = size.nextnode;
		}
		return count;
	}

	int Max() {
		int max = head.data;
		Node temp = head;
		while (temp != null) {
			if (temp.data > max) {
				max = temp.data;
			}
			temp = temp.nextnode;
		}
		return max;
	}

	int Min() {
		int min = head.data;
		Node temp = head;
		while (temp != null) {
			if (temp.data < min) {
				min = temp.data;
			}
			temp = temp.nextnode;
		}
		return min;
	}

	void display() {
		Node n = head;
		while (n != null) {
			System.out.print(" " + n.data);
			n = n.nextnode;
		}
	}

}
