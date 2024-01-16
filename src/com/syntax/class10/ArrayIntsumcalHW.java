package com.syntax.class10;

public class ArrayIntsumcalHW {
public static void main(String[] args) {
	
	/*
	 * Create an array on integers and calculate the sum of all elements in an array
	 */
	
	
	int[] numbers= {15,45,10,32};
	int sum=0;
	
	for(int num:numbers) {
		sum+=num;
	}
	System.out.println("Sum of all elements in the array = "+sum);
	//RUN: Sum of all elements in the array = 102
	
	
	
	
	
	
	
	
	
}
}
