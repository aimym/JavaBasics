package com.syntax.class07;

import java.util.Scanner;

public class DoLoopExample {
public static void main(String[] args) {
	
	/*
	 * Create a secret number
	 * 
	 * we want user to guess our secret number
	 * 
	 * the moment the user guessed my secret number---> my program should stop 
	 * otherwise it should continue asking to guess my number
	 */
	
	int secretNumber=12;
	Scanner scan=new Scanner(System.in);
	int guessNumber;
	
	do {
		System.out.println("Enter number to to win"); 
		guessNumber=scan.nextInt();
	}while(guessNumber!=secretNumber);
	
	System.out.println("Congratulations");
	
	scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
