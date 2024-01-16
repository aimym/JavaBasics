package com.syntax.class03;

public class MoreExamples {
public static void main(String[] args) {
	/*
	 * we need to declare a boolean variable hungry yes or no
	 * if we are hungry--> I am going to eat
	 * otherwise--> I am going to drink a tea
	 */
      boolean hungry=false;
      if (hungry==true) {
    	  System.out.println("I am going to eat");
      }else {
    	  System.out.println("I am going to drink a tea");
      } // I am going to drink a tea

      boolean hungry1=true;
      if (hungry1==true) {
    	  System.out.println("I am going to eat");
      }else {
    	  System.out.println("I am going to drink a tea");
      } // I am going to eat

      boolean hungry2=true;
      if (hungry2) {
    	  System.out.println("I am going to eat");
      }else {
    	  System.out.println("I am going to drink a tea");
      } // I am going to eat
      boolean hungry3=false;
      if (hungry3) {
    	  System.out.println("I am going to eat");
      }else {
    	  System.out.println("I am going to drink a tea");
      }// I am going to drink a tea
      
      boolean traffic=false;
      if (traffic) {
    	  System.out.println("I am coming home late");
      }// nothing comes out, If you change "False" to "True" it will come out
     
      /* define a variable to store a browser
       * if browser is chroom--> we are executing tests on chrome
       * otherwise--> browser is not supported for our test
       */
       String browser="chrome";
       if (browser.equals("chrome")) {
    	   System.out.println("We are executing tests on chrome");
       }else {
    	   System.out.println("We are not executing any test cases");
       } // we are executing tests on chrome
    //if(browser){}//Type mismatch: connot convert from string to boolean

       // always use "equals" to compare 2 Strings 
       // This can work "==" but best way is "equals"
       if (browser=="chrome") {
    	   System.out.println("We are executing tests on chrome");
       }else {
    	   System.out.println("We are not executing any test cases");
       }
       /*If you type "Chrome" with uppercase in String,it comes out "else"
        * not "if" because it will be "false"
        */
       
       
}
}
