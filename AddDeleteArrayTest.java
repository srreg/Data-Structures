package com.regnant.ds;

import java.util.Arrays;
import java.util.Scanner;

public class AddDeleteArrayTest {

	public static void main(String[] args) {

		int[] arr = { 15, 9, 45, 43, 89 };

		AddDeleteArray ada = new AddDeleteArray();
		int[] Addarr = ada.Addarr(arr);
		System.out.println("Master  Array: " + Arrays.toString(arr));
		System.out.println(
				'\n' + "After adding " + ada.add_ele_count + " elemnts, the Array is: " + Arrays.toString(Addarr));

		System.out.println("Enter how many elements to delete: ");
		Scanner sc = new Scanner(System.in);
		int del_ele_count = sc.nextInt();
		int[] DelArray = ada.Deletearr(Addarr, del_ele_count);
		System.out.println("Master Array for Delete: " + Arrays.toString(Addarr));
		System.out.println("Udated Array is: " + Arrays.toString(DelArray));
		sc.close();
	}

}
