package com.shriram.while1;

public class DoWhileContinue {

	public static void main(String[] args) {

		int x = 0;

		// The flow of Continue in do-while loop will not go to the starting point of
		// the loop instead it will first go to the conditional check in the while and
		// if that satisfies then only the flow will go to the start point

		do {
			x++;
			System.out.println(x);
			if (++x < 5)
				continue;

		} while (++x < 10);
	}

}
