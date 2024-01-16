package com.syntax.class11;

public class Class06 {
public static void main(String[] args) {
	
	/*
	 * Write a java program to check whether a given number is prime or not
	 */
	
	//If a number is not greater than 1 it is not a prime
	
	int number=5;
	boolean isPrime=true;
	
	if(number>1) {
		
	}else {
		isPrime=false;
	}
	System.out.println(number+" isPrime "+isPrime);
	 
	int num=29;
	boolean isPrim=true;
	
	for(int i=2; i<num; i++) { //i<Math.sqrt(num); <<--- another way
		if(num%i==0) {
			isPrim=false;
			break;
		}
	}
	if(isPrim) {
		System.out.println(num+" is a Prime number");
	}else {
		System.out.println("Not a Prime number");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
