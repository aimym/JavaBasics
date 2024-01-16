package com.syntax.class10;

public class Task03 {
public static void main(String[] args) {
	
	/*
	 * Create a 2D array where you will store the following values:
	 * Mr,Mrs,Ms,Miss and Smith, Jordan, Jackson, Obama.
	 * After storing valuesbprint following String:
	 * Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan
	 */
	
	String[] [] values= {
			{"Mr","Mrs","Ms","Miss"},
			{"Smith","Jordan","Jackson","Obama"}
		};
	System.out.println(values[0][1]+" "+values[1][0]);
	System.out.println(values[0][0]+" "+values[1][3]);
	System.out.println(values[0][2]+" "+values[1][2]);
	System.out.println(values[0][3]+" "+values[1][1]); 
	
	
	
	
	
	
	
	
	
	
}
}
