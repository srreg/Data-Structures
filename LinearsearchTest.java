package com.regnant.ds;

import java.util.Arrays;

public class LinearsearchTest {

	public static void main(String[] args) {
		int[] arr = { 15, 12, 18, 36, 45, 28, 6, 89, 55 };
		System.out.println("Master Array: " + Arrays.toString(arr));
		Linearsearch ls = new Linearsearch();
		ls.linearSearch(arr, 45);
	}

}
