package com.regnant.ds;

import java.util.Scanner;

public class StackExercise {

	Scanner sc = new Scanner(System.in);
	int[] arr;
	int cursor = 0, size;

	void getStack() {

		System.out.println("Enter Stack Size:");
		size = sc.nextInt();
		arr = new int[size];
	}

	void push(int ele) throws Stackoverflow {

		if (cursor == size) {
			throw new Stackoverflow("Index Size Exceeded");
		} else {
			arr[cursor] = ele;
			cursor++;
		}
	}

	void pop() throws StackUnderFlow {

		cursor = cursor - 1;
		if (cursor < 0) {
			throw new StackUnderFlow("There is no element to Delete");
		} else {
			arr[cursor] = 0;
		}
	}
}
