package com.syntax.class07;

import java.util.Scanner;

public class GuessNumber {
public static void main(String[] args) {
	
	int secretNumber=77;
	Scanner sc=new Scanner(System.in);
	int guessNumber;
	
	do {
		System.out.println("Enter a number to win");
	    guessNumber=sc.nextInt();
	}while (guessNumber!=secretNumber);
	 
	System.out.println("Congratulations"); 
	 
	sc.close();
	
	
	
	
	
	
	
	
	
	
	
	
}
}
