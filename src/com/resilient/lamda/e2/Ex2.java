package com.resilient.lamda.e2;

import com.resilient.lamda.IVaule;

public class Ex2 {
	private void demo() {
		ISquare f = (float x) -> x * x;
		IVaule random = () -> Math.random() * 100;
		IVaule x100 = () -> 100;
		ITestNum iseven = (int i) -> i % 2 == 0;
	}

}
