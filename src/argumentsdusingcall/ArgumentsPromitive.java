package argumentsdusingcall;

public class ArgumentsPromitive {
	int first;
	int second;
	private void dosomething(int p, int q) {
		System.out.println("before"+p);
		System.out.println("before"+q);
		p = p + 5;
		q = q + 9;
		System.out.println("After"+p);
		System.out.println("After"+q);

	}
	public static void main(String[] args) {
		ArgumentsPromitive argumentsPromitive= new ArgumentsPromitive();
		int p=10;
		int q=20;
		argumentsPromitive.dosomething(p, q);
		
		System.out.println("Main p"+p);
		System.out.println("Main  q"+q);
		
		

	}
}
