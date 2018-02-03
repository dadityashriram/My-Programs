package com.shriram.break1;

public class LabelledBreak {

	public static void main(String[] args) {

		int x = 10;

		l1: {
			System.out.println("Begin");

			if (x == 10) {
				break l1;
			}
			System.out.println("Did not break");
		}

		System.out.println("Continuing");

	}
}
