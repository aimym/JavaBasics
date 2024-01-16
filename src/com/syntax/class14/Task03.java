package com.syntax.class14;

public class Task03 {

	/*
	 * Create a method that will say Hello in different language
	 * based on the country that will passed method is executed
	 */
	
	String sayHello(String country) {
		switch (country) {
		case "USA":
			return "Hello";
		case "France":
			return "Bonjour";
		case "Turkey":
			return "Marhaba";
			default:
				return "Unknown";
		}
	}
	
	public static void main(String[] args) {
		
		Task03 object=new Task03();
		String country=object.sayHello("USA");
		System.out.println(country);
		
		
		
		
		
		
		
	}
}
