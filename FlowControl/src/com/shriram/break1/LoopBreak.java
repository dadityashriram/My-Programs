package com.shriram.break1;

public class LoopBreak {

	public static void main(String[] args) {

		int x = 10;

		for (int i = 0; i < x; i++)

		{
			if (i == 5) {
				// We can use break inside loop statements to break the execution based on some
				// condition
				break;
			}
			System.out.println(i);

		}

	}

}
