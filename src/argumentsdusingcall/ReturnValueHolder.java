package argumentsdusingcall;

public class ReturnValueHolder {
	private int first;
	private int second;
	private int third;
	private String returnValue;

	public int getFirst() {
		return first;
	}

	public int getSecond() {
		return second;
	}

	public int getThird() {
		return third;
	}

	public String getReturnValue() {
		return returnValue;
	}

	public ReturnValueHolder(int first, int second, int third, String returnValue) {
		super();
		this.first = first;
		this.second = second;
		this.third = third;
		this.returnValue = returnValue;
	}
}
