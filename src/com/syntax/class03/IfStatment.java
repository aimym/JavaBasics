package com.syntax.class03;

public class IfStatment {

	public static void main(String[] args) {
   
		/*
		 *  Senario: I need to compare 2 numbers and I've to find witch is bigger
		 */
		int num1=100;
		int num2=50;
		if (num1>num2) {
		} System.out.println(num1 + " is larger than " + num2); //anything true is appeares
		 if (num1<num2) {
			 System.out.println(num1 + " is larger than " + num2);
		 } // anythinf false does not appear
		 
		 double money=5;
		 double price=4.99;
		 // If I have more money than price of the coffee I am buying coffee
		  
		 if (money>price) {
	  } System.out.println("I am buying the coffee");// I am buying the coffee
	  // if (money=price) // Error--> because if condition always must be boolean
	  //we use double --> because of the wrong operator
	   double money1=5;
	   double coffee=5;
		if (money1>=coffee) {
			System.out.println("I am buying the coffee");
		}
		
	
	
	}
	 }


