package com.resilient.classdemo;


public class BoxClass {
	private int height;
	private int width;
	private int depth;   

	public BoxClass(int height, int width, int depth) {
		super();
		this.height = height;
		this.width = width;
		this.depth = depth;

	}

	public int volume() {
		return height * width * depth;

	}

	public int splicedVolume(int noOfParts) {
		return volume() / noOfParts;
	}
}
