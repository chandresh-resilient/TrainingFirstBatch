package com.resilient.inheritence;

public class Thing implements Comparable<Thing> {
	public double getVolume() {
		return volume;
	}

	public double getMass() {
		return mass;
	}

	private double volume;
	private double mass;

	public Thing(double volume, double mass) {
		this.volume = volume;
		this.mass = mass;
		// System.out.println("Thing.Thing() " + 100 / 0);
	}

	public double getMomentum(double speed) {
		return mass * speed;

	}

	@Override
	public int compareTo(Thing arg0) {
		return (int) (this.mass - arg0.getMass());
	}


}
