package com.syntax.class07;

public class ForLoop {
public static void main(String[] args) {
	
	/*
	 * While and Do while used in Java when we don't know in advance how many times we want to reapet
	 * from of code:
	 * excample: lottery
	 */
	
	/*
	 * For loop --- MOST WIDELY LOOP IN JAVA
	 * 
	 *  I WANT TO SAY "HELLO" 5 TIMES
	 *  
	 *  for (int i=1; i<=5; i++){
	 *  SOPln("Hello"):
	 *  }
	 */
	
	/* 
	 * 1. Initialization 
	 * 2. condition
	 * 3. increment and decrement
	 */
	
	for (int a=1; a<=5; a++) {
		System.out.print("Hello" + " ");
	}
	System.out.println("------------------------------------------");
	
	/*
	 *  start point
	 *  end point
	 *  increment or decrement
	 */
	
	System.out.println("I NEED PRINT NUMBERS FROM 1 TO 20");
	
	for (int b=1; b<=20; b++) {
		System.out.print(b + " ");
	}
	
	System.out.println("I NEED TO PRINT NUMBERS FROM 10 TO 25");
	
	for(int c=10; c<=25; c++) {
		System.out.print(c + " ");
	}
	
	System.out.println("I NEED TO PRINT NUMBERS FROM 50 TO 1");
	
	for(int d=50; d>=1; d--) {
		System.out.print(d + " "); 
	}
	
	
	
	
	
	
	
	
	
	
	
}
}
