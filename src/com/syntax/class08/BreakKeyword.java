package com.syntax.class08;

public class BreakKeyword {
public static void main(String[] args) {
	
	//for (int i=1; i<4; i++) {
	//	System.out.println("I'm code inside for loop");
	//	break;
	//}
	System.out.println("End of the code");
	
	/*
	 * it executes: I'm code inside for loop
	 *              End of the code
	 */
	 
	boolean winter=true;
	while(winter) {
		System.out.println("It is cold");
		break;
	}// it prints: It is cold
	
	for (int a=1; a<=5; a++) {
		System.out.println("I am code inside for loop");
		if(a==3) {
			break;
		}
	} //it prints: I am code inside for loop 3 times
	
	boolean winter1=true;
	int temp=0;
	while(winter1) {
		System.out.println("It's cold");
		if(temp==20) {
			break;
	  }
	    temp+=5;
	}// it prints: It's cold 5 times
	
    
	
	
	
	
	
	
	
	
	
	
	
}
}
