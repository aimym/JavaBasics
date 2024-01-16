package com.syntax.class08;

public class ClockExercise {
public static void main(String[] args) {
 
	/*
	 * Try to complete a clock exercise.
	 * You can pick 12 or 24 hour clock
	 */
	
      for(int hour=0; hour<12; hour++)	{
    	  for(int min=0; min<=59; min++) {
    		  for(int sec=0; sec<=59; sec++) {
    			  System.out.println(hour+":"+min+":"+sec);
    		  }
    	  } 
      }
	
	
	
	
	
	
	
	
}
}
