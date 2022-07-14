package com.resilient.control;

public class ControlStatements {
	public static void main(String[] args) {
		int month = 6;
		int day = 23;
		if (month >= 11 || month < 3) {
			System.out.println("its winter");
			if (month == 12) {
				System.out.println("its real cold winter");
				if (day == 23) {
					System.out.println("its real cold ,and bithday...");
				}
			}
		}
		if (month >= 3 || month < 7) {
			System.out.println("its Summer");
		}
		if (month >= 7 || month < 11) {
			System.out.println("its raining............");
		}

	}
}
