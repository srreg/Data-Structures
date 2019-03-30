package com.regnant.ds;

import java.util.Scanner;

public class QueueExercise {

	Scanner sc = new Scanner(System.in);
	int[] arr;
	int curs = 0, size;

	void getStack() {

		System.out.println("Enter Stack Size:");
		size = sc.nextInt();
		arr = new int[size];
	}

	void push(int ele) throws Stackoverflow {

		if (curs == size) {
			throw new Stackoverflow("Index Size Exceeded");
		} else {
			arr[curs] = ele;
			curs++;
		}
	}

	void pop() throws StackUnderFlow {

		curs = curs - 1;
		if (curs < 0) {
			throw new StackUnderFlow("There is no element to Delete");
		} else {
			for (int i = 0, j = 1; i < arr.length - 1 && j < arr.length; i++, j++) {
				arr[i] = arr[j];
			}
		}
		arr[curs] = 0;
	}
}
