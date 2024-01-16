package com.syntax.class07;

import java.util.Scanner;

public class HW {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter value for sale");
	String sale=input.next();
	
	if (sale.equalsIgnoreCase("no")) {
		System.out.println("You are not going for shopping");
	
	}else if (sale.equalsIgnoreCase("yes")) {
		System.out.println("What is the price of item");
		int actualPrice=input.nextInt();
		int discount=input.nextInt();
		
		if (actualPrice<20) {
		 discount=10;
		} else if(actualPrice>=20 && actualPrice>=100) {
			discount=30;
		}else if (actualPrice >=100 && actualPrice<=500) {
			discount=30;
		} else {
			discount=50;
		}
		int saving=(actualPrice*discount)/100;
		int finalPrice=actualPrice - saving;
		
		System.out.println("Afetr " + discount + " % discount the price of the item reduce from " + " to " + finalPrice);
	}
	
	  input.close(); 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
