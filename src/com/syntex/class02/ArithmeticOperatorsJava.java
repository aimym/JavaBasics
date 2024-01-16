package com.syntex.class02;

public class ArithmeticOperatorsJava {

	public static void main(String[] args) {
      double num3=10;
      double num4=6;
      System.out.println(num3/num4);
		
      float num5=10f;
      float num6=6f;
      System.out.println(num5/num6);
		// % -remainder
		int i=10;
		int j=3;
		System.out.println(i%j);
		
		/*Task 1. Write a Java program to add, subtract,multiply and devide 2 decimal values. 
     * 
     */
		double d1=20;
		double d2=7;
		double devide=d1/d2;
		System.out.println("The devide of 2 numbers " + d1 + " and " +d2 + " is equal to " + devide);
		/*Task2. Write a program to find the square of the number 3.9
		 * 
		 */
		double square=3.9;
		double square1=4;
		double square2=square*square1;
		System.out.println("The square of the number " + square + " is " + square2);
		/*Task3. Write a program to print the area and perimeter of a rectangle 
		 * with width = 5 an height = 8
		 */
		int width=5;
		int height=8;
		int perimeter=2*(width+height);
		int area=width*height;
		System.out.println("The perimeter of a reqtangle with width " + width + " and " + height + " is equal to " + perimeter + " and the area is " + area);
		
		
				
	}

}
