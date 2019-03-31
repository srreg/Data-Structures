package com.regnant.ds;

import java.util.Arrays;

public class InsertSortExerciseTest {

	public static void main(String[] args) {
		int[] insertarr = { 15, 12, 18, 36, 45, 28, 6, 89, 55 };
		System.out.println("Master Array: " + Arrays.toString(insertarr));
		InsertSortExercise ie = new InsertSortExercise();
		ie.inserSort(insertarr);
	}

}
