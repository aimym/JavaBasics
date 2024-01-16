package com.syntax.class05;

import java.util.Scanner;

public class Task01 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter what day is today");
	 String day=scan.nextLine();
	
	 if (day.equalsIgnoreCase("Monday") || day.equals("Friday")){
		System.out.println("There is no class today");
	}else if(day.equalsIgnoreCase("Tuesday") || day.equals("Wednesday")) {
		System.out.println("Manual");
	}else if(day.equalsIgnoreCase("Thursday")) {
		System.out.println("Review class");
	}else if(day.equalsIgnoreCase("Saturday") || day.equals("Sunday")) {
		System.out.println("Java class");
	}else {
		System.out.println("Error");
	}
	scan.close();
	
	
}
}
