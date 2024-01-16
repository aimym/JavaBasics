package com.syntax.class08;

import java.util.Scanner;

public class HW2AnotherExample {
public static void main(String[] args) {
	
	double price=3.99;
	System.out.println("Enter pay for your coffe");
	
	Scanner in=new Scanner(System.in);
	double pay;
	
	do {
		pay=in.nextDouble();
		if(pay>price) {
			System.out.println("Please give less");
		}else if(pay<price) {
			System.out.println("Please give more");
		}
	}while(pay!=price);
	System.out.println("Enjoy your coffee");
		
	in.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
