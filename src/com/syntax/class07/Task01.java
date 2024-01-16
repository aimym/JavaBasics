package com.syntax.class07;

public class Task01 {
public static void main(String[] args) {
	//Print numbers from 1 to 100 in 1 line with space
	
	int a=1;
	
	while(a<=100) {
		System.out.print(a+ " ");
		a++;
	}
	System.out.println("-");
	System.out.println("----------------------------------------------");
	
	//Print numbers from 100 to 1
	
	int b=100;
	
	while(b>=1) {
		System.out.println(b);
		b--;
	}
	System.out.println("---------------------------------------------------");
	
	//Print even numbers 20 to 100
	
	int c=20;
	 while (c<=100) {
		System.out.println(c);
		 c+=2;
	 }
	
	System.out.println("------------------------------------------------------");
	
   // Print only odd numbers from 100 to 1	
	
	 int m=99;
	 while (m>0) {
		 System.out.print(m + " "); 
		m-=2;
	 }
	
}
}
