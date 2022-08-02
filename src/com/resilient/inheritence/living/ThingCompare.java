package com.resilient.inheritence.living;

import com.resilient.inheritence.Thing;

public class ThingCompare extends Thing implements Comparable<Thing> {

	public ThingCompare(double volume, double mass) {
		super(volume, mass);
	}

	@Override
	public int compareTo(Thing arg0) {
		return (int) (this.getMass() - arg0.getMass());
	}

}
