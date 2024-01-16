package com.syntax.class11;

import java.util.Arrays;
public class Task09 {
public static void main(String[] args) {
	
	//To find the second largest number in an Array
	
	//Create 2 variables to hold largest a 2nd largest value
	
	int largest=0;
	int secondLargest=0;
	
	int [] arr={2,9,3,60,50};
	
	for(int i=0; i<arr.length; i++) {
		if(arr[i]>largest) {
			secondLargest=largest;
			largest=arr[i];
		}else if(arr[i]>secondLargest) {
			secondLargest=arr[i]; 
		}
	}
	System.out.println(Arrays.toString(arr));
	System.out.println(largest);
	System.out.println(secondLargest);  
	
	
	
	
	
	
	
	
	
	
}
}
