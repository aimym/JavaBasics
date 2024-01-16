package com.syntax.class09;

public class AllValuesFromArray {
public static void main(String[] args) {
	
   String[]cities= {"Washington DC", "Miami", "Los Angeles", "New York"};
   for(int a=0; a<cities.length; a++) {
	   System.out.println(cities[a]+ " ");
   }// Washington DC Miami Los Angeles New York 
	
	// If values is Miami --> I want to  live in Miami
   
   for(int a=0; a<cities.length; a++) {
	   System.out.println(cities[a]);
	   if(cities[a].equals("Miami")) { 
		   System.out.println("I want to live in Miami");
	   }
   }
	
	
	
	
	
	
	
	
	
	
	
}
}
