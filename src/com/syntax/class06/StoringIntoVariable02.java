package com.syntax.class06;

import java.util.Scanner;

public class StoringIntoVariable02 {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);   
	System.out.println("Enter your quiz score");
	int quizScore=scan.nextInt();
	
	System.out.println("Enter your mid-term");
	int midtermScore=scan.nextInt();
	
	System.out.println("Enter your final score");
	int finalScore=scan.nextInt();
	
	int score=(quizScore + midtermScore + finalScore)/3;
	
	char grade;
	
	if (score>=90) {
		grade='A';
	}else if (score>=70 && score<90) {
		grade = 'B';
	}else if (score>=50 && score<70) {
		grade='C';
	} else {
		grade='F';
	}
	System.out.println("Your grade is " + grade);
	
	/* if your id "A" or "B" --> you're a good student
	 * Otherwise --> you should study harder
	 */
	if(grade=='A' || grade=='B') {
		System.out.println("You're a good student");
	}
	
	scan.close();
	
	
	
	
	
	
	
	
	
	
	
}
}
