package com.resilient.intro;

public class check {

	DemoClassOne getCar() {
		int i = 10;
		long l = 1000000000;
		char c = 'c';

		Integer i1 = i;
		i = i1;
		Long l2 = l;
		Character c1 = c;

		long p = l2 * i;
		if ((Math.random() * 100 + 1) / 2 == 0) {
			return new Democlass2();
		}
		return new DemoClassOne();
	}
}