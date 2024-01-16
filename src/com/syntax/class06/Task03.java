package com.syntax.class06;

import java.util.Scanner;

public class Task03 {
public static void main(String[] args) {
	
	Scanner cal=new Scanner(System.in);
	System.out.println("Enter number 1");
	int num1=cal.nextInt();
	
	System.out.println("Enter number 2");
	int num2=cal.nextInt();
	
	System.out.println("Enter the operator you are willing to use (exp: +, -. *, /,):");
    char operator=cal.next().charAt(0);
    
    int result=0;
	
	if(operator=='+') {
		result=num1+num2;
	}else if(operator=='-') {
		result=num1-num2;
	}else if(operator=='*') {
		result=num1*num2;
	}else if(operator=='/') {
		result=num1/num2;
	}else {
		System.out.println("Invalid");
	}
	System.out.println(num1 + operator + num2 + " = " + result);
	
	cal.close();
}
}
