package com.syntax.class09;

public class ForEachLoop {
public static void main(String[] args) {
	
	/*
	 * If you have an array you can use for each loop to itarate/loop 
	 * through the entire array
	 */
	
	String [] cities= {"Washington DC", "Boston", "Miami", "Los Angeles", "New York"};
	for(String city:cities) {
		System.out.println(city);
	}//it prints: all of them
	
	int [] numbers= {10,20,30,40};
	for(int num:numbers) {
		System.out.println(num);
	}// it executes: 10 20 0 40
	
	char[]grades= {'A','B','C','D'};
	for (char grade:grades) {
		System.out.println(grade);
	} // A B C D
	
	String[] countries=new String [5];
	countries[0]="USA";
	countries[1]="Canada";
	countries[2]="Afganistan";
	countries[3]="Moldova";
	countries[4]="Morocco";
	
	for(String country:countries) {
		System.out.println(country);
	}
	
	/*
	 * For each loop Syntax
	 * for(dataType varName:nameOfTheArray){
	 * syso(varName)
	 * };
	 */
	
	
	
	
	
	
	
	
	
	
	
	
}
}
