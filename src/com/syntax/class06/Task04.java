package com.syntax.class06;

import java.util.Scanner;

public class Task04 {
public static void main(String[] args) {
	
	Scanner sale=new Scanner(System.in);
	System.out.println("Is that Item is on sale");
	
	String value=sale.nextLine();
	
	if(value.equalsIgnoreCase("Yes")) {
		System.out.println("Enter the price on the Item");
	int price=sale.nextInt();
    int discount=0;
    
    if(price<20) {
    	discount=10;
    }else if(price>=20 && price<100) {
    	discount=20;
    }else {
    	discount=50; 
    }
	 
    double savings=price-(price*discount)/100;
    System.out.println("After " +discount+ "% "+" the price of the item  reduce from "+ price+ " to "+savings);
	}else {
		System.out.println("You are not shopping");
	}
	sale.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
