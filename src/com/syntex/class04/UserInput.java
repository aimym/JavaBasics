package com.syntex.class04;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
    
	    Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name");
				
        //if you want to capture single String-> use next 
	
	   String name=input.next();//type String and hit enter
	   System.out.println(name);
	   //Please enter your name
	   
	  //If you want to capture int-->use nextInt();
      System.out.println(name+" Please enter your age ");
      
      int age=input.nextInt();
	  System.out.println("Your name is "+name+" and your age is "+age);
	
	input.close();
	
	}
}
