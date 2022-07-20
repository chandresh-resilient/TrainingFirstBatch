package com.resilient.inheritence;

public class Thing {
	private double volume;
	private double mass;

	public Thing(double volume, double mass) {
		this.volume = volume;
		this.mass = mass;
		//System.out.println("Thing.Thing() " + 100 / 0);
	}

	public double getMomentum(double speed) {
		return mass * speed;

	}

}
