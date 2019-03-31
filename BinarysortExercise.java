package com.regnant.ds;

import java.util.Arrays;

public class BinarysortExercise {
	int temp, poss, pose, posm;

	int[] bubbleSort(int[] bubarr) {
		for (int i = 0; i < bubarr.length; i++) {
			for (int j = 0; j < bubarr.length - 1; j++) {
				if (bubarr[j] > bubarr[j + 1]) {
					temp = bubarr[j];
					bubarr[j] = bubarr[j + 1];
					bubarr[j + 1] = temp;
				}
			}
		}
		return bubarr;
	}

	void binarySearch(int[] arr, int element) {
		if (element >= arr[arr.length / 2]) {
			int len = (arr.length/2)-1;
			poss = len;
			for (int i = len; i < arr.length; i++) {
				poss++;
				if (element == arr[i]) {
					System.out.println("Index position: " + poss);
					break;
				} else {
					if (element == arr.length - 1) {
						System.out.println("No such element");
						break;
					}
					continue;
				}
			}
			
//			
//		} else if (element == arr[arr.length / 2]) {
//			posm = (arr.length / 2);
//			System.out.println("Index position m: " + posm);
			
			
		} else if (element < arr[(arr.length / 2)]) {
			pose = 0;
			for (int i = 0; i < arr.length/2; i++) {
				pose++;
				if (element == arr[i]) {
					System.out.println("Index position s: " + pose);
					break;
				} else {
					if (element == arr.length - 1) {
						System.out.println("No such element");
						break;
					}
					continue;
				}
			}
		}
	}
}