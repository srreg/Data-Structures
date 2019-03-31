package com.regnant.ds;

import java.util.Arrays;

public class BubblesortExerciseTest {

	public static void main(String[] args) {
		int[] bubrevarr = { 15, 12, 18, 36, 45, 28, 6, 89, 55 };
		int[] bubarr = { 15, 12, 18, 36, 45, 28, 6, 89, 55 };
		System.out.println("Master Array: " + Arrays.toString(bubarr));
		BubblesortExercise be = new BubblesortExercise();
		System.out.print("Reverse Sort: ");
		be.bubbleSortrev(bubrevarr);
		System.out.print("Sorted: ");
		be.bubbleSort(bubarr);
	}

}
