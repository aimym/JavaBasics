package com.syntax.class14;

public class Task06 {

	/*
	 * Create class Student that will have a method getGrade. Your method should accept the score
	 * of a student and return a grade
	 * score>90=A
	 * score>80=B
	 * score>70=C
	 * score>50=D
	 * anything else = F
	 */
	
	char getGrade(int score) {
		if(score>=90) {
			return'A';
		}else if(score>=80 && score<90) {
			return 'B';
		}else if(score>=70 && score<70) {
			return 'C';
		}else if(score>=50 && score<70) {
			return 'D';
		}else {
			return 'F';
		}
	}
	
	public static void main(String[] args) {
	
		Task06 object=new Task06();
		System.out.println(object.getGrade(95));//A
		
		
		
		
	}
}
