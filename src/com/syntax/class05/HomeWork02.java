package com.syntax.class05;

import java.util.Scanner;

public class HomeWork02 {
public static void main(String[] args) {
	
  Scanner scan=new Scanner(System.in)	;
	System.out.println("Please enter what day is today?");
	String day=scan.nextLine();
	
	if(day.equalsIgnoreCase("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
		System.out.println("This is weekday");
	}else if(day.equalsIgnoreCase("Saturday") || day.equals("Sunday")) {
		System.out.println("This is weekend");
	}else {
		System.out.println("Error");
	}
	scan.close();
	
	
	
}
}
