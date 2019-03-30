package com.regnant.ds;

public class DoubleLinkedListExerciseTest {

	public static void main(String[] args) {
		DoubleLinkedListExercise dl = new DoubleLinkedListExercise();
		dl.push(15);
		dl.push(18);
		dl.push(9);
		dl.push(21);
		dl.push(81);
		// dl.pop();
		// dl.pop1();
		System.out.print("Linked List:");
		dl.display();
		System.out.print("\n" + "Reverse Order: ");
		dl.revDisplay();
	}

}
