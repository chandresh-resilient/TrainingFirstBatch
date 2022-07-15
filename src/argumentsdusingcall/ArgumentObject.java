package argumentsdusingcall;


public class ArgumentObject {
	int first;
	int second;

	private String dosomething(ArgumentObject a) {
		System.out.println("before "+a.first);
		System.out.println("before "+a.second);
		a.first = a.first + 5;
		a.second = a.second + 9;
		System.out.println("After "+a.first);
		System.out.println("After "+a.second);
		return "Successful";

	}
	private ReturnValueHolder dosomething1(ArgumentObject a) {
		int value1=a.first*5;
		int value2=a.first*3;
		int value3=a.first*4;
		String value4="Something";
		return new ReturnValueHolder(value1, value2, value3, value4);
	}
	
	public static void main(String[] args) {
		
		ArgumentObject argumentsPromitive2= new ArgumentObject();
		argumentsPromitive2.first=10;
		argumentsPromitive2.second=20;
		argumentsPromitive2.dosomething(argumentsPromitive2);
		ReturnValueHolder value = argumentsPromitive2.dosomething1(argumentsPromitive2);
		System.out.println("Main "+argumentsPromitive2.first);
		System.out.println("Main "+argumentsPromitive2.second);
		
		System.out.println(value.getFirst());
		System.out.println(value.getSecond());
		System.out.println(value.getThird());
		System.out.println(value.getReturnValue());
	}
}
