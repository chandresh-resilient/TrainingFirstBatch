package com.resilient.classes.constructors;

public class parameterizedConstruct {
	double width;
	double height;
	double depth;

	// This is the constructor for Box.
	parameterizedConstruct(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// compute and return volume
	double volume() {
		return width * height * depth;
	}
}