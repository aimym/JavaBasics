package com.syntax.class11;

public class Task04 {
public static void main(String[] args) {
	
	/*
	 * Create a 2D array of integer
	 * Develop a program which will calculate the sum of even and odd 
	 * numbers for that array
	 */
	
	int [][] array2D= {
			{2,3,4},
			{5,6},
			{12,6,8}
	};
	int sumEven=0;
	int sumOdd=0;
	
	for(int i=0; i<array2D.length; i++) { 
		for(int b=0; b<array2D[i].length; b++) {
			int element=array2D[i][b];
			if(element%2==0) {
				sumEven+=element;
			}else {
				sumOdd+=element;
			}
		}
	}
	System.out.println("Sum of even numbers "+sumEven);
	System.out.println("Sum of odd numbers "+sumOdd);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
