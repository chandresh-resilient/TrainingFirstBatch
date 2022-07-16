package com.resilient.inheritence;

public abstract class LivingThing extends Thing {

	public LivingThing(double volume, double mass) {
		super(volume, mass);
	}

	public abstract void breath();

	public abstract void grow();

	public abstract void live();

}
