package com.resilient.generics.stats;

public class Stats<T extends Number> {
	public Stats(T[] obj) {
		super();
		this.obj = obj;
	}

	T[] obj;

	public double avarage() {
		double sum = 0.0;
		for (Number number : obj) {
			sum += number.doubleValue();
		}
		return sum / obj.length;

	}

	public boolean isAvrageSame(Stats<?> newOne) {

		double av1 = this.avarage();
		double av2 = newOne.avarage();
		return av1 == av2;
	}

}
