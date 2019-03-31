package com.regnant.ds;

import java.util.Arrays;

public class BinarysortExerciseTest {

	public static void main(String[] args) {
		int[] bubarr = { 15, 12, 18, 36, 45, 28, 6, 89, 55 };
		System.out.println("Master Array: "+Arrays.toString(bubarr));
		BinarysortExercise bse = new BinarysortExercise();
		int[] arr = bse.bubbleSort(bubarr);
		System.out.println("Sorted Array: "+Arrays.toString(arr));
		bse.binarySearch(arr, 28);
	}

}
