package com.regnant.ds;

public class LinkedListExerciseTest {

	public static void main(String[] args) {
		LinkedListExercise ll = new LinkedListExercise();

		ll.push(10);
		ll.push(15);
		ll.push(18);
		ll.push(36);
		ll.push(18);
		// ll.removebyPosition(4);
		// ll.remove(18);
		ll.push(51);
		int size = ll.Size();
		System.out.println("Size of the Linked List: " + size);
		int max = ll.Max();
		System.out.println("Max elment is: " + max);
		int min = ll.Min();
		System.out.println("Min element is: " + min);
		System.out.print("Linked List: ");
		ll.display();
	}

}
