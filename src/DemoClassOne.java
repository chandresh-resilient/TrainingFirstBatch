import java.io.File;
import java.io.OutputStream;

public class DemoClassOne {

	public static void main(String[] args) {
		DemoClassOne demoClassOne = new Democlass2();
		int r = demoClassOne.doSomeThing(2, 5, 7, 89);
		System.out.println(r);
		demoClassOne.see(new File("abc.txt"));
		demoClassOne.see(System.out);
		demoClassOne.see(4);
	}

	int doSomeThing(int i, int j, int k, int l) {
		return i * j - k + l;

	}

	void see(int i) {
		System.out.println("this a number see");
	}

	void see(File f) {
		System.out.println("this a file see");

	}

	void see(OutputStream out) {   
		System.out.println("this a stream see");

	}

}
