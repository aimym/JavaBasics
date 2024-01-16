package com.syntax.class10;

import java.util.Scanner;

public class HomeWork04Of08 {
public static void main(String[] args) {
	
	/*
	 * Write a program to swap 2 numbers without a temporary variable
	 */
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter first number");
	int a=scan.nextInt();
	
	System.out.println("Enter second number");
	int b=scan.nextInt();
	
	System.out.println("Before swaping: a="+a+" b="+b);
	
	b=a+b-(a=b);
	
	scan.nextLine();
	
	System.out.println("After swaping: a="+a+" b="+b);
	
	scan.close();
	
	
	
	
	
	
	
	
	
}
}
