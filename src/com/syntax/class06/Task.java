package com.syntax.class06;

import java.util.Scanner;

public class Task {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter your country");
	
	String country=input.nextLine();
	String language;
	
	switch (country.toLowerCase()) {
	case"usa":
		language="english"; 
	    break;
	case "russia":
	      language="russian";
	      break;
	case "germani":
	     language="deutsch";
	     break;
	case "china":
	     language="chinese";
	     break;
	   default:
		   language="unknown";
	 }
	System.out.println("In " + country + " people speak " + language + " language");
	
	input.close();
	
	
	
	
	
}
}
