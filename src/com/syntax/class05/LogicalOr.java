package com.syntax.class05;

public class LogicalOr {
public static void main(String[] args) {
	
	//OR ||
	
	/*
	 * True || True = True
	 * True || False = True
	 * False || True = True
	 * False || False = False
	 */
	
	String day="Saturday";
	if ( day.equals("Saturday") || day.equals("Sunday")){
		System.out.println("I have java class");
	}
	System.out.println("Code outside of the statement");
	//it executes: "I have java class" and "Code outside of the statement"
	
	/*
	 *  int num1=1000;
	 *  int num2=2000;
	 *  int num3=300;
	 *  if(num1>num2 || num1>num2){
	 *  } syso("num1+" is the largest") <-- this statment will be false because one of the statement is false but other one is true so
	 *  because you use here "OR" statment, and one of them is True, java will think it's the correct answer'
	 *  You better use here "&&" 
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
