package com.syntax.class05;

public class LogicalNot {
public static void main(String[] args) {
	
	// logical used to revert the condition
	
	boolean value=!false;
	System.out.println(value);// when you run it'll execute true
	
	value=!true;
	System.out.println(value);// it'll execute false
	
	System.out.println("-----------------");
	boolean traffic=true;
	if(!traffic) {
		System.out.println("I will come on time to work");
	}
	System.out.println("------THE END----------");//if you change the true to false it'll execute "I will come on time to work
	
	traffic=false;
	if(!traffic) {
		System.out.println("I'll come on time to work");
	}
	System.out.println("----------------");
	
	String day="Saturday";
	if(!day.equals("Saturday")) {
		System.out.println("Today is not Saturday");
	}
	System.out.println("---------THE END------------");// it'll not execute "Today is not Saturday"
	
	boolean checkboxChecked=true;
	if(!checkboxChecked) {
		System.out.println("I'll click on that checkbox");
	}// nothing comes out
	
	checkboxChecked=false;
	if(!checkboxChecked) {
		System.out.println("I'll click on that checkbox");
	}//it'll execute "I'll click on that checkbox"
	
	System.out.println("----------------");
	
	String java="hard";
	if(!java.equals("hard")) {
		System.out.println("You are genius");//it won't execute "You are genius"
	}
	System.out.println("--------THE END-------");
	
	java="easy";
	if(java.equals("hard")) {
		System.out.println("You are genius");
	}
	System.out.println("--------THE END------");//It will execute "You are genius"
	
}
}
