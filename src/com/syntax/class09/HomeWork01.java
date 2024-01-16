package com.syntax.class09;

public class HomeWork01 {
public static void main(String[] args) {
	
	/*
	 * Create an array of cars and store 6 elements into it.
	 * Using 2 different loops print all values from the array
	 */
	
	String [] cars= {"Hyunday", "BMW", "Toyota", "Mercedes", "Audi", "Ford"};
	for(int a=0; a<cars.length; a++) {
		System.out.print(cars[a]+" ");
	}
	
	String [] carss=new String [6];
	carss[0]="Hyunday";
	carss[1]="BMW";
	carss[2]="Audi";
	carss[3]="Mercedes";
	carss[4]="Toyota";
	carss[5]="Ford";
	for(String carr:carss) {
		System.out.println(carr+ " ");
	}
	
	/*
	 * Create an array of animals and store 6 elements into it.
	 * Using 2 different loops print all elements from the array
	 */
	
	String [] animals=new String[6];
	animals[0]="Cat";
	animals[1]="Dog";
	animals[2]="Deer";
	animals[3]="Cow";
	animals[4]="Goat";
	animals[5]="Rabbit";
    for(String animal:animals) {
    	System.out.println(animal);
    }	
    
    String [] animalss= {"Dog", "Cow", "Deer", "Cat", "Goat", "Rabbit"};
    for(int c=0; c<animalss.length; c++) {
    	System.out.print(animalss[c]+ " "); 
    }
	
	
	
	
	
	
	
	
}
}
