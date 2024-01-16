package com.syntax.class10;

public class ArrayLargestHW {
public static void main(String[] args) {
	
	/*From an array of integer elements find the largest number
	*/
	
	int [] number= {15,45,10,32};
	int largest=number[0];
	
	for(int n=1; n<number.length; n++) {
		if(number[n]>largest) {
			largest=number[n];
		}
	}
	System.out.println(largest); //45
	
	System.out.println("-----------------------------------");
	
	int [] a= {10,20,30,40};
    int lar=a[0];
    for(int num:a) {
    	if(num>lar) {
    		lar=num;
    	}
    }
	System.out.println(lar);
	
	
	
	
	
	
	
	
	
	
}
}
