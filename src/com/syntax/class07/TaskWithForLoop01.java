package com.syntax.class07;

public class TaskWithForLoop01 {
public static void main(String[] args) {
	
	// Print numbers from 1 to 100 in 1 line with space
	
	for(int a=1; a<=100; a++) {
		System.out.print(a + " ");
	}
	System.out.println("------------------------------------------------");
	
	// Print numbers from 100 to 1
	
	for (int b=100; b>=1; b--) {
		System.out.println(b + " ");
	}
	System.out.println("-------------------------------------------------------");
	
	// Print even numbers from 20 to 100
	
	for (int c=20; c<=100; c+=2) {
		System.out.print(c + " ");
	}
	System.out.println("------------------------------------------------------------");
	
	// Print odd numbers from 100 to 1
	
	for (int d=99; d>0; d-=2) {
		System.out.print(d + " "); 
	}
	
	
	
	
	
	
}
}
