package com.resilient.generics.wild;

public class DemoClass {
	public static void main(String[] args) {
		TwoD t1 = new TwoD();
		t1.setX(40);
		t1.setY(90);
		TwoD t2 = new TwoD();
		t1.setX(44);
		t1.setY(92);
		ThreeD t3 = new ThreeD();
		t3.setX(56);
		t3.setY(12);
		t3.setZ(12);
		ThreeD t4 = new ThreeD();
		t3.setX(56);
		t3.setY(12);
		t3.setZ(12);
		TwoD[] twos = { t1, t2, t3 };
		GroupDObjects<TwoD> tdosobj = new GroupDObjects<>(twos);
		showXy(tdosobj);

		ThreeD[] thD = { t3, t4 };
		GroupDObjects<ThreeD> threeD = new GroupDObjects<>(thD);
		showXyz(threeD);

	}

	private static void showXy(GroupDObjects<?> twos) {

		for (int i = 0; i < twos.twoDstuff.length; i++) {
			System.out.println("x: [" + twos.twoDstuff[i].getX() + "]  y:[" + twos.twoDstuff[i].getY() + "]");
		}

	}

	private static void showXyz(GroupDObjects<? extends ThreeD> twos) {

		for (int i = 0; i < twos.twoDstuff.length; i++) {
			System.out.println("x: [" + twos.twoDstuff[i].getX() + "]   y:[" + twos.twoDstuff[i].getY() + "]   z:["
					+ twos.twoDstuff[i].getZ() + "]");
		}

	}
}
