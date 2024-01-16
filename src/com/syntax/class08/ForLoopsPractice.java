package com.syntax.class08;

public class ForLoopsPractice {
public static void main(String[] args) {
	
	/*
	 * 3 X 1 = 3
	 * 3 X 2 = 6
	 * 3 X 3 = 9
	 */
	
	int num=3;
	int result;
	
	for (int i=1; i<=10; i++) {
		result=num*i;
		System.out.println(num + " X " + i + " = " + result);
	}
	System.out.println("What is the output");
	
	for(int a=0; a<=10; a+=3) {
		System.out.println(a + " ");
	} // the output: 0 3 6 9
	
    System.out.println("---------WHAT IS THE OUTPUT---------------");	
    
    int sum=0;
    for(int b=1; b<=5; b++) {
    	sum+=b; //sum=sum+i;<--- longer way
    }
	System.out.println(sum); // the output is: 15
	
	int value=0;
	for(int c=0; c<4; c++) {
		//value;
	}
	System.out.println(value); // the output is 0 
	// if your int value is 1 the output is still 0
	
	int value2=1;
	for( int d=1; d<4; d++) {
		value2*=d;
	}
	System.out.println(value2); // output is 6
}
}
