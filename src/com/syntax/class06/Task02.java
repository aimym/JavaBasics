package com.syntax.class06;

import java.util.Scanner;

public class Task02 {
public static void main(String[] args) {
	
	Scanner cal=new Scanner(System.in);
	System.out.println("Enter number 1");
	int num1=cal.nextInt();

    System.out.println("Enter number 2");
	int num2=cal.nextInt();
	
	System.out.println("Enter the operatior you are willing to use (exp: -, +, /, *):");
    String operator=cal.next();
	int math=0;
	
	switch(operator) {
	case "+":
		math=num1+num2; 
		break;
	case "-":
		math=num1-num2;
		break;
	case "/":
		math=num1/num2;
		break; 
	case "*":
		math=num1*num2;
		break;
		default:
			System.out.println("Invalid");
	
	}
	System.out.println(num1 + operator + num2 +" = " + math);
	cal.close();
}
}
