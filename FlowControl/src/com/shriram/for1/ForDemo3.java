package com.shriram.for1;

public class ForDemo3 {

	static int[][][] x = { { { 10, 20 }, { 30, 40 } }, { { 50, 60, 70 }, { 80, 90 } } };

	public static void main(String[] args) {

		// for (int i = 0; i < x.length; i++) {
		//
		// for (int j = 0; j < x[i].length; j++) {
		//
		// for (int k = 0; k < x[i][j].length; k++) {
		//
		// System.out.println(x[i][j][k]);
		// }
		// }
		// }

		for (int x1[][] : x) {

			for (int x2[] : x1) {

				for (int x3 : x2) {

					System.out.println(x3);

				}

			}
		}

	}

}
