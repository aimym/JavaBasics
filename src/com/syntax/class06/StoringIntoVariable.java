package com.syntax.class06;

import java.util.Scanner;

public class StoringIntoVariable {
public static void main(String[] args) {
	
     
	/*
	 * As a programers we're writing a "Source code". Using Java we write a "source code".
	 * After we write a "Source code" there is a "complirer" it translates your code from "Source" to "binary"
	 */
	 // Anything java showes you error it is "Complirer"
	
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter your quiz");
	  int quizScore=scan.nextInt();
	  
	  System.out.println("Enter your mid-term");
	  int midtermScore=scan.nextInt();
	  
	  System.out.println("Enter your final scora");
	  int finalScore=scan.nextInt();
	  
	  int score=(quizScore+midtermScore+finalScore)/3;
	  
	  if (score>=90) {
		 System.out.println("Grade A");
	 }else if (score>=70 && score <90) { 
		 System.out.println("Grade B");
	 }else if (score >=50 && score<70) {
		 System.out.println("Grade C");
	 }else {
		 System.out.println("grade F");
	 }
    
	  scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
