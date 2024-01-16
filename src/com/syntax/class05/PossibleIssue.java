package com.syntax.class05;

import java.util.Scanner;

public class PossibleIssue {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Capturing values using next");
	 
	String value=scan.next();
	System.out.println(value);
	
	System.out.println("Capturing values using nextLine");
	
	String anotherValue=scan.nextLine();
	System.out.println(anotherValue);
	
	System.out.println("End of the program");

	
   System.out.println("Please enter temperature");	

   int temp=scan.nextInt();
   System.out.println(temp);
	
	scan.nextLine();
	
	System.out.println("Please enter city");
	
	anotherValue=scan.nextLine();
	System.out.println(anotherValue);
	
	System.out.println("End of the program");
	
	/*
	 * Every time when you want to use "nextLine(); after next(); --> nextInt(); --> nextDouble();
	 * --> nextBoolean(); --> next().charAt(0);  type "scan.nextLine(); <-- just itself
	 */
	
	 scan.close();
	
	
	
}
}
