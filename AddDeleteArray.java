package com.regnant.ds;

import java.util.Scanner;

public class AddDeleteArray {

	int[] AddArray, DelArray;
	int add_ele_count, del_ele_count, position;
	Scanner sc = new Scanner(System.in);

	int[] Addarr(int[] arr) {

		System.out.println("Enter how many elements to add: ");
		add_ele_count = sc.nextInt();
		AddArray = new int[arr.length + add_ele_count];
		for (int i = 0; i < arr.length; i++) {
			AddArray[i] = arr[i];
		}

		for (int i = arr.length; i < AddArray.length; i++) {
			System.out.println("Enter " + (i + 1) + "th element: ");
			AddArray[i] = sc.nextInt();
		}
		return AddArray;
	}

	int[] Deletearr(int[] arr, int del_ele_count) {

		if (del_ele_count == 0) {
			return DelArray;
		}
		for (int i = 0; i < del_ele_count; i++) {
			DelArray = new int[arr.length - 1];
			System.out.println("Enter element to delete:");
			int del_ele = sc.nextInt();
			for (int k = 0; k < arr.length; k++) {

				if (arr[k] == del_ele) {
					position = k;

					for (int l = 0; l < position; l++) {
						DelArray[l] = arr[l];
					}

					for (int j = position; j < DelArray.length; j++) {
						DelArray[j] = arr[j + 1];
					}
				}
			}
		}
		del_ele_count--;

		return Deletearr(DelArray, del_ele_count);
	}
}
