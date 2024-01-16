package com.syntax.class07;

import java.util.Scanner;

public class CalculatorusingIf {
public static void main(String[] args) {
	
	Scanner calc=new Scanner(System.in);
	System.out.println("Enter your first value");
	int val1=calc.nextInt();
	
	System.out.println("Enter desired operator");
	char op=calc.next().charAt(0);
	
	System.out.println("Enter your second value");
	int val2=calc.nextInt();
	
	int result=0;
	
	if (op=='+') {
		result=val1+val2;
	}else if (op=='-') {
		result=val1-val2;
	}else if (op=='*') {
		result=val1*val2;
	}else if (op=='/') {
		result=val1/val2;
	}else {
		System.out.println("Invalid entry"); 
	}
	System.out.println(result);
	
	calc.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
