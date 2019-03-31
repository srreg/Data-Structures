package com.regnant.ds;

import java.util.Arrays;

public class BubblesortExercise {
	int temp;

	void bubbleSortrev(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	void bubbleSort(int[] bubarr) {
		for (int i = 0; i < bubarr.length; i++) {
			for (int j = 0; j < bubarr.length - 1; j++) {
				if (bubarr[j] > bubarr[j + 1]) {
					temp = bubarr[j];
					bubarr[j] = bubarr[j + 1];
					bubarr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(bubarr));
	}
}
