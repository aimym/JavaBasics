package com.syntax.class06;

import java.util.Scanner;

public class Task01 {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your grade");
    String grade=scan.nextLine();
	String explanation;

	switch(grade.toUpperCase()) {
	case "A":
		explanation="Excelent";
		break;
	case "B":
		explanation="Good";
		break;
	case "C":
		explanation="Average";
		break;
	case "D":
		explanation="Bad";
		break;
		default:
			explanation="Not acceptable";
			
		}
	System.out.println(grade+" is " + explanation);
	
	
	scan.close();
}
}
