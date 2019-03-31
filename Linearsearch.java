package com.regnant.ds;

public class Linearsearch {
	void linearSearch(int[] arr, int element) {
		int pos = -1;
		for (int i = 0; i < arr.length; i++) {
			pos++;
			if (element == arr[i]) {
				System.out.println("Index position: " + pos);
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
