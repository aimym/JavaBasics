package com.syntax.class13;

public class MethodsDemo3 {

	int squareTheNumber(int number) {
		return number*number;
	}
      
	public static void main(String[] args) {
	
		MethodsDemo3 obj=new MethodsDemo3();
		int result=obj.squareTheNumber(5);
		System.out.println(result);//25
}
}
