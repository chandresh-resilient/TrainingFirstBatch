import com.resilient.intro.Car;

public class MyOut {
	public static void main(String[] args) {
		System.out.println("test............");
		String testString = "123";
		testString = testString + "456";
		testString.charAt(4);
		String anotherString = "123456";
		String anotherString2 = "123456";
		int indexof = anotherString.indexOf("315");
		System.out.println("indexof    " + indexof);
		System.out.println(testString.equals(anotherString));
		System.out.println(anotherString2 == anotherString);

		Car car1 = new Car(7, 8, "Maruti");
		Car car2 = new Car(7, 8, "Maruti");
		// car1.setAge(45);

		System.out.println(car1.equals(anotherString2));
		System.out.println(car1.equals(car2));
		System.out.println(car1 == car2);
		System.out.println(testString);
		StringBuffer buffer = new StringBuffer("789");
		buffer.append("adding more to this");
		for (int i = 0; i < 100; i++) {
			buffer.append(i);
		}
		System.out.println(buffer.toString());
		System.out.println(System.getenv("Path"));

	}
}
