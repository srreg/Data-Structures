package com.regnant.ds;

import java.util.Arrays;

public class QueueExerciseTest {

	public static void main(String[] args) {

		QueueExercise qe = new QueueExercise();
		qe.getStack();
		try {
			qe.push(9);
			qe.push(15);
			qe.push(18);
			qe.pop();
			qe.push(36);
			qe.pop();
			qe.pop();
			qe.pop();
			qe.pop();

		} catch (Stackoverflow e) {
			System.out.println(e);
		} catch (StackUnderFlow ee) {
			System.out.println(ee);
		}
		System.out.println("Cursor position is: " + qe.curs);
		System.out.println(Arrays.toString(qe.arr));
	}

}
