package com.syntax.class08;

public class NestedLoops {
public static void main(String[] args) {
	
	//Nested loop --> loop inside another loop
	
	for ( int i=1; i<=3; i++) {
		System.out.println("I am i loop " + i);
	for(int j=1; j<=2; j++) {
		System.out.println("I am nested j loop " + j);
	}
 }

	/*
	 * it prints out: I am i loop 1
	 *                I am nested j loop 1
	 *                I am nested j loop 2
	 *                I am i loop 2
	 *                I am nested j loop 1
	 *                I am nested j loop 2
	 *                I am i loop 3
	 *                I am nested j loop 1
	 *                I am nested j loop 2
	 */
	
	for(int a =1; a<=4; a++) {
		System.out.println(a);
		for(int b=1; b>=3; b++) {
			System.out.println(b);
		}
	} 
	/*
	 * it executes: 1
	 *              2
	 *              3
	 *              4
	 *  nested for has been ignored because of it's false
	 */
	
	for(int c=1; c<=4; c++) {
		System.out.println(c);
		for(int d=1; d<3; d++) {
			System.out.println(d);
		}
		System.out.println("-----------");
	}
	/*
	 * it executes: 1 outter loop
	 *              1
	 *              2
	 *           ---------
	 *              2
	 *              1
	 *              2
	 *          ----------
	 *              3
	 *              1
	 *              2
	 *          ---------
	 *              4
	 *              1
	 *              2
	 *           --------
	 */
	
	
	
	
	
	
	
	
	
	
	
}
}
