package com.resilient.control;

public class SwitchCase {
	public static void main(String[] args) {
		int month = 4;
		switch (month) {
		case 1:
		case 2: {
			System.out.println("winter");
			break;
		}
		case 4:
		case 5:
		case 6:
		case 3: {
			System.out.println("Summer");
			break;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + month);
		}

		int i = 10;
		String output;
		if (i > 10) {
			output = "i greater than 10";
		} else {
			if (month > 20)
				output = "bad code practice ";
			else
				output = " more bad code practice ";
		}
		output = i > 10 ? "i greater than 10" : month > 20 ? "bad code practice " : "more bad practice code";

	}
}
