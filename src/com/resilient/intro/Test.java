package com.resilient.intro;

public class Test {

	DemoClassOne getCar() {
		if ((Math.random()*100+1) / 2 == 0) {
			return new Democlass2();
		}
		return new DemoClassOne();
	}
}
