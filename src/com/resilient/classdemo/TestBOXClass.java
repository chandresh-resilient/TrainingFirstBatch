package com.resilient.classdemo;

public class TestBOXClass {

	public static void main(String[] args) {
		BoxClass box1 = new BoxClass();
		BoxClass box3 = box1;
		int i1 = 20;
		int i2 = i1;
		//box1.setDim(20, 30, 40);
		System.out.println(box1.volume());

		BoxClass box2 = new BoxClass(20);
		//box2.setDim(20, 60, 40);
		System.out.println(box2.volume());

		System.out.println("Spliced Volume for 2 parts " + box2.splicedVolume(2));
		// DRY

		BoxClass box23 = new BoxClass(20,50,30);
		//box2.setDim(20, 60, 40);
		System.out.println(box23.volume());

		System.out.println("Spliced Volume for 2 parts " + box23.splicedVolume(2));
		// DRY

	}
}
