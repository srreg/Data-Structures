package com.regnant.ds;

import java.util.Arrays;

public class StackExerciseTest {

	public static void main(String[] args) {

		StackExercise se = new StackExercise();
		se.getStack();
		try {
			se.push(9);
			se.push(5);
			se.push(15);
			se.push(18);
			se.pop();
			se.pop();
			se.pop();
			se.pop();
			se.pop();
		} catch (Stackoverflow e) {
			System.out.println(e);
		} catch (StackUnderFlow ee) {

			System.out.println(ee);

		}
		System.out.println("Cursor position: " + se.cursor);
		System.out.println(Arrays.toString(se.arr));
	}

}
