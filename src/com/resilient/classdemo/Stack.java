package com.resilient.classdemo;

public class Stack {
	 private int element=0;
	  int[] stack= new int[15];

	    public void lastElement(){
	        int num = stack[--element];
	        System.out.println("Your top remaiming element is : " + num);
	        num=stack[++element];
	    }

	  public void push(int num){
	      stack[element++]= num;
	      System.out.println("element added successfully");
	  }//end push

	   public void pop(){
	      int num=stack[--element];
	     System.out.println("element popped succesfully, popped element is: "+ num);
	   } //end pop
}
