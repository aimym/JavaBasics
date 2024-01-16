package com.syntax.class09;

public class HomeWork03 {
public static void main(String[] args) {
	
	/*
	 * Create an array on integers and calculate the sum of all elements in an array
	 */
	
	int arr[]= {1,2,3,4,5};
    int sum=0;	
	
    for(int i=0; i<arr.length; i++) {
    	sum=sum+arr[i];
    }
	System.out.println("Sum of all the elements of an array:% "+sum);
	
	// The other way
	
	int [] numbers= {15,45,10,32};
	sum=0;
	
	for(int num:numbers) {
		sum+=num;
	}
	System.out.println("Sum of all elements in the array = "+sum);
	
	
	
	
	
	
	
	
	
}
}
