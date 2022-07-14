package com.resilient.classdemo;

public class StackTest {
	public static void main(String[] args) {
			Stack stack= new Stack();
			stack.push(10);
			stack.push(12);
			stack.push(19);
			stack.push(14);
			stack.push(7);
			
			System.out.println(stack.pop()) ;
			System.out.println(stack.pop()) ;
			System.out.println(stack.pop()) ;
			System.out.println(stack.pop()) ;
			System.out.println(stack.pop()) ;

//			7
//			14
//			19
//			12
//			10
			
	}
}
