package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {
   int num1=10;
   int num2=16;
   System.out.println(num1>num2); // false
   System.out.println(num1==num2);//false
   System.out.println(num1<num2);//true
   
   boolean result=num1!=num2;
   System.out.println(result);// true
   System.out.println("Result is "+result);//Result is true
   //boolean result=num1==num2;//10==16-> No
   //System.out.println(result);//false
   
   System.out.println(num1=num2);//16//reassignin
   System.out.println(num1);//16
   System.out.println(num1==num2);//true// comparing
   System.out.println(num1!=num2);//false
	}

}
