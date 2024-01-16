package com.syntax.class07;

import java.util.Scanner;

public class SecretNumberUsingWhile {
public static void main(String[] args) {
	
	int secretNumber=12;
	Scanner scan=new Scanner(System.in);
	int guessNumber;
	
	System.out.println("Enter a number to win");
	guessNumber=scan.nextInt();
	
	while (guessNumber!=secretNumber) {
		System.out.println("Enter a number to win");
		guessNumber=scan.nextInt();
	}
	System.out.println("Congratulations"); 
	 scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
