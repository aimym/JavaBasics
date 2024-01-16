package com.syntax.class08;

import java.util.Scanner;

public class TaskAskUserCreditCard {
public static void main(String[] args) {
	
    Scanner scan=new Scanner(System.in);	
	String answer;

	do {
		System.out.println("Do you want to apply for a credit card?");
		answer=scan.nextLine();
	}while(!answer.equals("yes"));
	
	System.out.println("Congrats! here your Card");
	
	scan.close(); 
	
	
	
	
	
	
}
}
