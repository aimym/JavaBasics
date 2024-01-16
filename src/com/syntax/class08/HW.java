package com.syntax.class08;

import java.util.Scanner;

public class HW {
public static void main(String[] args) {
	/*
	 * Ask a user to enter name, last name and age 5 times. Every time your program should those values 
	 * in a format "Your name is __ and you are __ years old"
	*/
	Scanner scan=new Scanner(System.in);
	
	for(int a=1; a<=5; a++) {
	System.out.println("Enter your name");
	String name=scan.nextLine();
	
	System.out.println("Enter your last name");
	String lname=scan.nextLine();
	
	System.out.println("Enter your age");
	int age=scan.nextInt();
	
	scan.nextLine();
	
	System.out.println("Your name is "+ name+ " " +lname+ " and you are " +age+ " years old");
	
	}
 	
	System.out.println("------------");
  	   
 	
	scan.close();
	
}
}
