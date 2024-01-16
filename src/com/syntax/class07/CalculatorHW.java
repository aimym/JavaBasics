package com.syntax.class07;

import java.util.Scanner;

public class CalculatorHW {
public static void main(String[] args) {
	
	/* Using Scanner class create calculator. Allow user to enter 2 numbers and operator (+,-,*,/)
	 * Based on operator provide the result
	 */
	
	int num1;
	int num2;
	char operator;
	Scanner sc;
	
	sc=new Scanner(System.in);
	System.out.println("Enter first number");
	num1=sc.nextInt();
	
	System.out.println("Enter second number");
	num2=sc.nextInt();
	
	System.out.println("What is the operator?");
	operator=sc.next().charAt(0);
	
	int result=0;
	
	switch(operator) {
	case '+':
		result=num1+num2;
		break;
	case '-':
		result=num1-num2;
		break;
	case '*':
		result=num1*num2;
		break;
	case '/':
    if(num2!=0)	{
    	result=num1/num2;
    }else {
    	System.out.println("We can't devide a number by " + num2);  
    }	
		break;
		default:
			System.out.println("invalid operator");
		}
	
	System.out.println(result); 
	
	sc.close();   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
