
public class Democlass2 extends DemoClassOne{
	
	public static void main(String[] args) {
		DemoClassOne demoClassOne=new Test().getCar();
		int r=demoClassOne.doSomeThing(2,5,7,89);
		System.out.println(r);
	}
	
	
	@Override
	int doSomeThing(int i, int j, int k, int l) {
		trunOnTheDRL();
		return super.doSomeThing(i, j, k, l);
		//change3
		//change4
	}


	private void trunOnTheDRL() {
		System.out.println("DRL ON on left side");
		
	}
}
