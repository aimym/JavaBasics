package com.syntax.class07;

public class DoLoopDemo {
public static void main(String[] args) {
	
	System.out.println("----I want to print numbers from 1 to 30 using do while loop");
	
	int a=1;
	do {
		System.out.print(a + " ");  
	     a++;
	}while(a<=30);  
	
	System.out.println("---------WHILE CHECKS CONDITION BEFORE EXECUTION----------");
	
   int  b=1;
   while (b<=5) { // while is most used
	   System.out.println("Hello"); // Prints 5 times  
	   b++;
   }
	System.out.println("----------DO WHILE-----------------");
	
	int c=1;
	do {
		System.out.println("Hello");
		c++;
	}while(c<=5); //executes 5 times

	System.out.println("--------------DO WHILE CHECKS CONDITION AFTER EXECUTION-----------------");
	int d=10;
	do {
		System.out.println("Hello");
		}while (d<=3); // it'll execute only 1 time 
	
	//MORE EXAMPLE
	
	int f=10;
	do {
		System.out.println("Hello");
		f++; // <---- if you remove it it will execute infinitely too
	}while(f>=3); // it will print infinitely
	
	System.out.println("I WANT TO PRINT NUMBERS FROM 1 TO 30 USING DO WHILE LOOP");
	
	int h=1;
	do {
		System.out.println(h + " ");
		h++;
	}while(h<=30); //it prints 30 times
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
