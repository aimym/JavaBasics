package com.syntax.class06;

public class StringSwitch {
public static void main(String[] args) {
	
   String car="BMW";	
   String country;
   
   switch (car) {
   case "BMW":
	   country="Germany";
	   break;
   case "Ford":
	   country="USA";
	   break;
   case "Toyota":
	   country="Japan";
	   break;
	   default:
		   country="Unknown";
		   break;
   }
   System.out.println(car+" is from " + country);//BMW is from Germany
   
   /*
    * String car="toyota";
    * String country;
    * switch(car.toUpperCase()) or toLowerCase
    */
	
	/*
	 * if you use "switch (car.UpperCase()) {}" all other cases have to be "UpperCase"
	 * example: "BMW' "LADA"
	 * if you use "switch (car.toLowerCase()) {}" all other cases have to be "LowerCase" 
	 * example: "toyota" "ford"
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
