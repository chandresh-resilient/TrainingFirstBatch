package com.resilient.inheritence.living;

import com.resilient.inheritence.LivingThing;

public class NotATree extends LivingThing{

	public NotATree(double volume, double mass) {
		super(volume, mass);
		// TODO Auto-generated constructor stub
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

}
