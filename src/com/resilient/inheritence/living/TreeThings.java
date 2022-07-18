package com.resilient.inheritence.living;

import com.resilient.inheritence.LivingThing;

public class TreeThings extends LivingThing {

	public TreeThings(double volume, double mass) {
		super(volume, mass);
		System.out.println("TreeThings.TreeThings()");
	}

	@Override
	public void breath() {
		System.out.println("Photosynthesis");

	}

	@Override
	public void grow() {
		System.out.println("TreeThings.grow() with trunk and branches and leaves...");

	}

	@Override
	public void live() {
		// TODO Auto-generated method stub
		
	}

}
