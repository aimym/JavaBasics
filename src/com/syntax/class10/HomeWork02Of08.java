package com.syntax.class10;

public class HomeWork02Of08 {
public static void main(String[] args) {
	
	/*
	 * Create a 2D array or integer type where you will store odd or even numbers.
	 * Develop a program which will identify/print the even numbers only
	 */
	
	int [][] num= {
			{23,50,},
			{100,200,300},
			{250,500,91,167}
	};
	int even=0;
	
	for(int i=0; i<num.length; i++) {
     for(int b=0; b<num[i].length; b++) {
    	 if(num[i][b]%2==0) {
    		 even+=num[i][b];
      }else {
    	  continue;
      }
    }
	}
	System.out.println(even);  
	
	
	
	
	
	
	
	
	
	
	
	
}
}
