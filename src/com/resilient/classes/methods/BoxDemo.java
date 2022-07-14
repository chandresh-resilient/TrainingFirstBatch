package com.resilient.classes.methods;

public class BoxDemo {

	public static void main(String[] args) {
		BoxwithVolume mybox = new BoxwithVolume(); // create a Box object called mybox
		mybox.width = 100;
		mybox.height = 20;
		mybox.depth = 15;
		mybox.volume();

		BoxDemoMethodParametersAndReturn boxDemoMethodParametersAndReturn = new BoxDemoMethodParametersAndReturn(); // create
		boxDemoMethodParametersAndReturn.setDim(20, 30, 50);
		System.out.println(boxDemoMethodParametersAndReturn.volume());

	}

}
