package com.resilient.inheritence;

public class NonLivingThing extends Thing{

	public NonLivingThing(double volume, double mass) {
		super(volume, mass);
		System.out.println("NonLivingThing.NonLivingThing()");
	}

}
