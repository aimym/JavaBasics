package com.syntax.class11;

public class Task03 {
public static void main(String[] args) {
	
	/*Create 2D array of integer type where you will store Odd and Even numbers
	 * Develop a program which will identify/print the even numbers only
	 * Create a 2D array 
	 * Store Even and Odd numbers in the 2D array
	 */
	
	int [][] array2D= {
			{2,3,4},
			{5,6},
			{12,6,8}
	};
	for(int i=0; i<array2D.length; i++) {
		for(int b=0; b<array2D[i].length; b++) {
			int elements=array2D[i][b];
			if(elements%2==0) {
				System.out.println(elements);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
