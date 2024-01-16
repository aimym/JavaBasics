package com.syntex.class04;

public class NestedIf {
public static void main(String[] args) {
	
	boolean vaccine=true;
	int dose=1;
	if(vaccine) {
	System.out.println("How many dose you have");	
	if(dose==1) {
		System.out.println("you need another shot");
	}else{
		System.out.println("You are fully vaccinated");
	}
	}else {
		System.out.println("I don't have any further question");
	}
	/*
	 * Declare a variable for allergy
	 * if you have allergy--> if you have pollen
	 *                        if you have peanut
	 *                        if you have wheat
	 *  if no allergy-->you are lucky                      
	 */
	
	boolean allergy=true;
	if(allergy) {
		System.out.println("Let's check what allergies you have");
	String allergyType="Pollen";
	if(allergyType.equals("Pollen")){
	System.out.println("Please stay at home when trees are blooming, take med A");
	}else if(allergyType.equals("peanut")){
		System.out.println("Please do not eat food that contains nuts, please take med B");
	}else if(allergyType.equals("gluten")) {
		System.out.println("Please follow gluten free diet, take med C");
	}else {
		System.out.println("I don't know which suggestion to give you");
	}
	}else {
		System.out.println("You are lucky");
	}
	
	
	 //if you change Outer if to False then else block comes out
	 /*nested if--> always has a dependency on outer if 
	  * outer if must be true in order for nested if to be checked
	  */
	
}
}
