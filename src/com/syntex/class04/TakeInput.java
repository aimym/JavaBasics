package com.syntex.class04;

import java.util.Scanner;

public class TakeInput {
public static void main(String[] args) {
	/*
	 * to import in mac:cmd+Shift+o
	 * to window:Ctrl+Shift+o
	 */
	 
	//1.create a Scanner and assign to a variable
	 Scanner scan=new Scanner(System.in);
	 
	 //2.specify instructions
	 System.out.println("Please enter country where you are from ");
	
	 //3.we need to capture String value-->use next():
	 String country=scan.next();
	 System.out.println("You are from "+country);
	
	//if you are from USA you speak English
	//if you are from France you speak french
	
	if (country.equals("USA")) {
		System.out.println("You speak English");
	}else if(country.equalsIgnoreCase("France")) {
		System.out.println("You speak France");
	}else if(country.equals("Turkey")) {
		System.out.println("You speak Turkish");
	}else {
		System.out.println("I don't know which language you speak");
	}
	/*
	 * Youn type for excample Turkey
	 * it will execute You are from Turkey You speak Turkish
	 * If you type Russia it will execute 
	 * I don't know which language you speak 
	 * beacuse there is no block for that word Russia
	 */

	/*
	 * if you type let's say USA with lower caps usa then it's error 
	 * it will execut else block I don't know which language you speak
	 */

    /*
     * example
     * if(country.equalsIgnorecase("USA")){
     * }
     * and you type with lower case usa it executes You speak english 
     * You type Turkey with upper caps TURKEY
     * It will execute You speak turkish
     */

     scan.close();
}
}
