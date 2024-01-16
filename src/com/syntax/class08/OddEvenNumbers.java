package com.syntax.class08;

public class OddEvenNumbers {
public static void main(String[] args) {
	
/*
 * I want to find out the sum of all Even and Odd numbers from 
 * the range 1 to 50	
 */
	 int sumEven=0;
	 int sumOdd=0;
	 
	 for(int i=1; i<=50; i++) {
		 if(i%2==0) {
			 sumEven=sumEven+i;
		 }else {
			 sumOdd=sumOdd+i;
		 }
	 }
	System.out.println("The sum of all Even numbers = "+sumEven+ " and the sum of all Odd numbers =  " +sumOdd);
	
	// it prints out: The sum od all Even numbers 650 and the sum off all Odd numbers =625
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
