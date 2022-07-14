package com.resilient.types.scope;

//Demonstrate block scope.
public class VariableScope {
	public static void main(String args[]) {
		int x; // known to all code within main
		x = 10;
		if (x == 10) { // start new scope
			int y = 20; // known only to this block
						// x and y both known here.
			System.out.println("x and y: " + x + " " + y);
			x = y * 2;
		}
		// y = 100; // Error! y not known here
		// x is still known here.
		System.out.println("x is " + x);

		// This fragment is wrong!
		count = 100; // oops! cannot use count before it is declared!
		int count;

	}

	// Demonstrate lifetime of a variable.

	public static void variableLifeTime(String args[]) {
		int x;
		for (x = 0; x < 3; x++) {
			int y = -1; // y is initialized each time block is entered
			System.out.println("y is: " + y); // this always prints -1
			y = 100;
			System.out.println("y is now: " + y);
		}
	}

	// This program will not compile
	public static void ScopeErr(String args[]) {
		int bar = 1;
		{ // creates a new scope
			int bar = 2; // Compile-time error – bar already defined!
		}

	}

}
