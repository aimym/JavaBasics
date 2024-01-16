package com.syntax.class14;

public class Task01 {

	/*
	 * Create a method that will take parameters as a number and print which number is larger
	 */
	
	void printLarger (int num1, int num2) {
		if(num1>num2) {
			System.out.println("Number 1 is bigger");
		}else if(num1<num2) {
			System.out.println("Number 2 is bigger");
		}else {
			System.out.println("Numbers are same");
		}
	}
	
	public static void main(String[] args) {
	
	Task01 object=new Task01();
	object.printLarger(20, 10);
	object.printLarger(10,20);
	object.printLarger(10, 10);
		
		
		
		
		
		
		
		
	}
}
