package com.resilient.inheritence.living;

import com.resilient.inheritence.LivingThing;

public class TreeThings extends LivingThing {

	public TreeThings(double volume, double mass) {
		super(volume, mass);
	}

	@Override
	public void breath() {
		System.out.println("Photosynthesis");

	}

	@Override
	public void grow() {
		System.out.println("TreeThings.grow() with trunk and branches and leaves...");

	}

}
