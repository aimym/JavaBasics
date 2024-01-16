package com.syntax.class03;

public class IfElseBlock {

	public static void main(String[] args) {
     int num1=100;
     int num2=50;
     // which number is largest
     if (num1>num2) {
    	 System.out.println(num1 + " is larger than " + num2);
     } else {
    	 System.out.println(num2 + " is larger than " + num1);
     } // 100 is larger than 50
     int num3=100;
     int num4=500;
     if (num3>num4) {
    	 System.out.println(num3 + " is larger than " + num4);
     }else {
    	 System.out.println(num4 + " is larger than " + num3);
     } // 500 is larger than 100
      
     int temp=45;
     /* if temp is more than 45 then I'm going for a walk
      * otherwise --> I'm staying at home
      */
      if (temp>45) {
    	  System.out.println(" I am going for a walk");
      } else {
    	  System.out.println("I am staying home");
      }// I am staying home
      if (temp>=45) {
    	  System.out.println("I am going for a walk");
      }// I am going for a walk
	 
      char gender='f'; // if you use Upper case "F" then it it will appear "Please use back of the trai"
      if (gender=='f') {
    	  System.out.println("Please use front of the train");
      } else {
    	  System.out.println("Please use back of the train");
      } //Please use front of the train
      
	char gender1='m';
	if (gender1=='f') {
		System.out.println("Please use front of the train");
	} else {
		System.out.println("Please use back of the train");
	} //Please use back of the train
	
	}
}
