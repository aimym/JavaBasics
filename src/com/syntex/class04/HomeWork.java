package com.syntex.class04;

public class HomeWork {

	public static void main(String[] args) {
 
		//Write a program to check wheter is positive or negative
		 int num=-72364;
		 if(num<0) {
			 System.out.println("The number "+num+" is negative");
		 } else {
			 System.out.println("The number "+num+ " is positive");
		 }//The number -72364 is negative
		 
		num=0; 
		if(num<0) {
			System.out.println("The number "+num+" is negative");
		}else if(num>0) {
			System.out.println("The number "+num+ " is positive");
		}else {
			System.out.println("The number is "+num); 
		}// The number is 0
		
		//Write a Java Program to check whether number is Even or Odd
		num=1000;
		if(num%2==0) {
			System.out.println("This "+num+" is an Even Number");
		}else {
			System.out.println("This "+num+" is Odd Number");
		}//The 1000 is an even number
		
		num=9;
		if(num%2==0) {
			System.out.println("This "+num+" is an even number");
		}else {
			System.out.println("This "+num+" is an Odd number");
		}//The 9 is Odd number
		
		
		
	}

}
