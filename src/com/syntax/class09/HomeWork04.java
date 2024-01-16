package com.syntax.class09;

public class HomeWork04 {
public static void main(String[] args) {
	
  // From an array of integer elements find the largest number
	
	int [] number= {15,45,10,32};
	
	int largest=number[0];
	
	for(int n=1; n<number.length; n++) {
		if(number[n]>largest) {
			largest=number[n]; 
		}
	}
	System.out.println(largest);
	
	// Another way
	System.out.println("-------Another way----------------");
	
	largest=number[0];
	
	for(int num:number) {
		
		if(num>largest) {
			largest=num;
		}
	}
	System.out.println(largest);
	
	
	
	
	
	
	
	
	
	
}
}
