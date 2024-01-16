package com.syntax.class13;

public class MethodsDemo01 {

void checkEvenOdd (int number) {
  if(number%2==0) {
	  System.out.println("Even");
  }else {
	  System.out.println("Odd");
  }
  
  }
  
  public static void main(String[] args) {
	
	MethodsDemo01 object1=new MethodsDemo01();
	object1.checkEvenOdd(120);//Even
	object1.checkEvenOdd(3);//Odd
	object1.checkEvenOdd(7);//Odd
	
	
	
	
	
	
}
}
