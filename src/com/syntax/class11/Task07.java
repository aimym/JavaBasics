package com.syntax.class11;

public class Task07 {
public static void main(String[] args) {
	
  /*
   * Write a Java Program to print the first 10 numbers of fibonacci
   * series:0,1,1,2,3,5,8,13,21,34
   * Store the numbers of fibonacci numbers the we want to produce
   *	Start from 0 or 1
   *Add the previous numbers to produce the next numbers
   *Check if we have printed the required numbers or not
   */
	
	 int howMany=10;
	 int previouse=0;
	 int current=1;
	 int next=0;
	 System.out.println(previouse+" ");
	 System.out.println(current+ " ");
	 
	 for(int i=0; i<howMany-2; i++){
		 next=previouse+current;
		 System.out.print(next+" ");
		 previouse=current;
		 current=next;
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
