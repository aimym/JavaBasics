package com.syntax.class10;

public class Task02 {
public static void main(String[] args) {
	
	/*
	 * Create an array of countries. While retriving all values from an array print capital for each country.
	 * Use 2 different loops
	 */
	
	String [] countries={"USA","Canada","Morocco"};
	String capital=null;
	 
	for(int i=0; i<countries.length; i++) { 
		switch (countries[i]) {
		case "Canada":
			capital="Ottowa";
			break; 
		case "Morocco":
			capital="Rabat";
			break;
		case "USA":
			capital="Washington DC";
			break;
		}
	System.out.println("The capital of the country "+countries[i]+" is "+capital); 
	}

	
	
	
	
	
	
	
	
	
}
}
