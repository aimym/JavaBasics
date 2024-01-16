package com.syntax.class03;

public class MoreIfStatements {
public static void main(String[] args) {
	 
	/*Define a variable to store a value of day
	 * If day is Saturday--> I am havina g Java class today 
	 * otherwise--> I don't know which class I have
	 */
	String day="Saturday";
	if (day.equals("Saturday")) {
		System.out.println("I am having java class today");
	}else {
		System.out.println("I don't know which class I have");
	}// I am having Java class today
	
	String day1="Saturday";
	if (day1.equals("Saturday")) {
		System.out.println("I am having java class today");
		System.out.println("I am very excited");
		System.out.println("I am going to have fun with my classmates");
	}else {
		System.out.println("I don't know which class I have");
	}
	/* I am having Java class today
	 * I am very excited
	 * I am going to have fun with my classmates
	 */
	
	String day2="Monday";
	if (day2.equals("Monday")) {
		System.out.println("I am very excited");
	}else {
		System.out.println("I don't know which class I have");
		System.out.println("Maybe today is fun day");
	  }
	 /*I don't know which class I have
	  * Maybe today is fun day
	  */
}
}
