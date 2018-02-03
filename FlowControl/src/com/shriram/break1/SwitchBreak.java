package com.shriram.break1;

public class SwitchBreak {

	public static void main(String[] args) {

		int x = 0;

		switch (x) {

		case 0:
			System.out.println("0");
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
			//Break statements can be used inside Switch to stop the fall through
			break;
		case 3:
			System.out.println("3");
		default:
			System.out.println("Default");

		}
	}

}
