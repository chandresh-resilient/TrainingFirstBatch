package com.resilient.classdemo;

public class StackTest {
	 public static void main(String[] args) {
	        Stack stack= new Stack();


	        stack.push(15);
	        stack.push(14);
	        stack.lastElement();

	        stack.push(13);
	        stack.push(12);

	        stack.lastElement();
	        stack.push(11);

	        stack.pop();
	        stack.pop();
	        stack.pop();

	        stack.lastElement();
	    }//end main	
	}

