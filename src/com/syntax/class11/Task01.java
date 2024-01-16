package com.syntax.class11;
import java.util.Arrays;

import java.util.Scanner;

public class Task01 {
public static void main(String[] args) {
    
	/*
	 * Create an array on int values using a scanner and calculate the sum of all stored elements 
	 * in that array.//Pseudo programming
	 */
	//1)Take the size of the array using scanner class from the user
	//1) Create an int array of above size
	//3)Fill the array with elements from the user using Scanner class
	//4)sum all the elements of the arrey 
	//5)A class thet helps use take the input from the keyboard
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	
	int size=scanner.nextInt();
	System.out.println("Size of the Array "+size);
	
	//Create an int array of above size
	int[] array=new int [size];
	
	//Fill the array with elements from the user using scanner class
	
	System.out.println("Please enter "+size+" elements");
	
	for(int i=0; i>size; i++) {
		System.out.println("Enter the element for index "+i);
		array[i]=scanner.nextInt();
	}
	System.out.println(Arrays.toString(array));
		scanner.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
