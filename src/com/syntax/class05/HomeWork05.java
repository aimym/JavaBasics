package com.syntax.class05;

import java.util.Scanner;

public class HomeWork05 {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your birth month");
	
	String month=scan.nextLine();
	if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("Junuary") || month.equalsIgnoreCase("February")) {
		System.out.println("Winter season");
	}else if(month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
		System.out.println("Spring season");
	}else if(month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
		System.out.println("Summer time");
	}else if(month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
		System.out.println("Fall time");
	}else {
		System.out.println("Error");
	}
	scan.close();
	
	
	
	
	
	
	
	
	
	
}
}
