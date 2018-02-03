package com.shriram.labelledbreak;

public class LabelledBreak {

	public static void main(String[] args) {

		int[][][] x = { { { 10, 20, 30 } }, { { 40, 50, 60 }, { 70, 80 } } };

		l1: for (int i = 0; i < x.length; i++) {
			l2: for (int j = 0; j < x[i].length; j++) {
				l3:

				for (int k = 0; k < x[i][j].length; k++) {

					System.out.println(x[i][j][k]);

					// we can use break and continue to break or continue a particular loop in the nested for loop
					continue l2;
					//break l3;
					

				}

			}

		}
	}
}
