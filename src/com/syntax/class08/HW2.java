package com.syntax.class08;

import java.util.Scanner;

public class HW2 {
public static void main(String[] args) {
	
	/*
	 * Declare a variable to store a price for coffe. Ask user to pay for a coffee.
	 * Keep asking to pay for coffee until user enters exact amount. If user give more than $3
	 * --> ask them to give less, if user gives less money then ask to give more money.
	 * Once a user got a right amount print "Please enjoy your coffee"
	 */

	double price=2.99;
	System.out.println("Please pay for your coffee");

    Scanner in=new Scanner(System.in);
    double pay=in.nextDouble();
    
    do{
    	if(pay>=price) {
    		System.out.println("Please give less");
    		pay=in.nextDouble();
    	}else if (pay<price) {
    		System.out.println("Please give more");
    		pay=in.nextDouble();
    	}
    }while(pay!=price);
    System.out.println("Please enjoy your coffee");

    in.close();


    




}
}
