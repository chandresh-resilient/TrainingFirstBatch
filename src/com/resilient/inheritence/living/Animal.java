package com.resilient.inheritence.living;

import com.resilient.inheritence.LivingThing;

public class Animal extends LivingThing {

	public Animal(double volume, double mass) {
		super(volume, mass);
		System.out.println("Animal.Animal()");
	}

	@Override
	public void breath() {
		System.out.println("NotATree.breath() consume Oxygen and produce energy...");
	}

	@Override
	public void grow() {
		System.out.println("become a grown up from a infant......");

	}

	public void move() {
		System.out.println("Go hear and there......");

	}

	@Override
	public void live() {
		System.out.println("NotATree.live()");
	}

}
