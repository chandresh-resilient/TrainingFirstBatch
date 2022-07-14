package com.resilient.control.loop;

public class Break {
	public static void main(String args[]) {
		int i = 0;
		while (i < 100) {
			if (i == 10)
				break; // terminate loop if i is 10
			System.out.println("i: " + i);
			i++;
		}
		System.out.println("Loop complete.");
	}

	public static void breakWorksOnOneLoopOnly() {
		for (int i = 0; i < 3; i++) {
			System.out.print("Pass " + i + ": ");
			for (int j = 0; j < 100; j++) {
				if (j == 10)
					break; // terminate loop if j is 10
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("Loops complete.");
	}

	public static void breakBlock() {
		boolean t = true;
		first: {
			second: {
				third: {
					System.out.println("Before the break.");
					if (t)
						break second; // break out of second block
					System.out.println("This won't execute");
				}
				System.out.println("This won't execute");
			}
			System.out.println("This is after second block.");
		}
	}
}
