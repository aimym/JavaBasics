package com.syntax.class10;

public class HomeWork01of08 {
public static void main(String[] args) {
	
	/*
	 * Create a 2D array of integer values.
	 * Print the sum of all numbers
	 */
	
     int [][]
    		 numbers= {
    				 {1,2,3,4,5},
    				 {10,20,30},
    				 {100,40,60,50}
    		 };
	int sum=0;
	for(int i=0; i<numbers.length; i++) {
		for(int j=0; j<numbers[i].length; j++) {
			sum+=numbers[i][j];
			System.out.println("The running total so far is "+sum);
		}
	}
	System.out.println("The final total is "+sum);
	
	
	
	
	
	
	
}
}
