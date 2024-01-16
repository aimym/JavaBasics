package com.syntax.class08;

public class ContinueKeyword {
public static void main(String[] args) {
	
	for(int i=1; i<=7; i++) {
		if(i==3) {
	     continue; // skip current iteration/cycle
		}
		System.out.println("Hello " +i);
		System.out.println("We are batch 12");
	}
	/*
	 * it'll execute: Hello 1
	 *                We are batch 12
	 *                Hello 2
	 *                We are batch 12
	 *                Hello 4 
	 *                We are batch 12
	 *                till"Hello 7" it ignores "hello 3"
	 */
	
	//I want to print all numbers from 1 to 10 except number 4
	
	for (int a=1; a<=10; a++) {
		if(a==4) {
			continue;
		}
		System.out.println(a + " ");
	}
	// it executes: 1 2 3 5 6 7 8 9 10 it ignores 4
	
	for( int b=1; b<=10; b++) {
		if(b==4 || b==7) {
			continue;
		}
		System.out.println(b + " ");
	} // it executes: 1 2 3 5 6 8 9 10 it ignores 4 and 7
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
