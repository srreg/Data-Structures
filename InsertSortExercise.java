package com.regnant.ds;

import java.util.Arrays;

public class InsertSortExercise {
	int temp, swap;

	void inserSort(int[] insertarr) {
		for (int j = 0; j < insertarr.length; j++) {
			for (int i = 0; i < insertarr.length - 1; i++) {
				temp = insertarr[i];
				if (temp > insertarr[i + 1] && temp < insertarr[i]) {
					swap = insertarr[i + 1];
					insertarr[i + 1] = temp;
					temp = swap;
				}

			}
		}
		System.out.println(Arrays.toString(insertarr));
	}

}
