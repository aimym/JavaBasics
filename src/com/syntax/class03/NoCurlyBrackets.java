package com.syntax.class03;

public class NoCurlyBrackets {
public static void main(String[] args) {
	
	boolean weekend=false;
	if(weekend) {
		System.out.println("I have java class at syntax");
	}else System.out.println("I might have other classes or day off");{
		System.out.println("I will enjoy this day");
	}
	System.out.println("End of the code");
	//else comes out and "End of the code"
	//if you change "false" to "true" if comes out
	
	boolean weekend1=true;
	if (weekend1)
		System.out.println("I have java classes at Syntax");
	else
	System.out.println("I might have other classes or day off");
	System.out.println("I will enjoy this day");
	
	System.out.println("End of the code");
	//I have java classes at syntax
	//I will enjoy this day
	//end of the code
	 /*
	  * in case if you don't use curly brackets, then one ststment inside each blocks fine.
	  * but when it comes to printing two ststments,then bla bla blsa
	  */
	
	
	
}
}
