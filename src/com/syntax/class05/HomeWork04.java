package com.syntax.class05;

import java.util.Scanner;

public class HomeWork04 {
public static void main(String[] args) {
	
	Scanner scorIn=new Scanner(System.in);
	System.out.println("Enter quiz score");
    int quiz=scorIn.nextInt();
	System.out.println("Enter mid term score");
	int mid=scorIn.nextInt();
	System.out.println("Enter final score");
	int fin=scorIn.nextInt();
	
	int ave=(quiz+mid+fin)/3;
	
			if (ave>=90) {
				System.out.println("Grade A");
			}else if (ave>=70 && ave<90) {
				System.out.println("Grade B");
			}else if (ave>=50 && ave <70) {
				System.out.println("Grade C");
			}else {
				System.out.println("Grade F");
			}
	scorIn.close();
	  
	
	
	
	
	
	
	
	
	
	
}
}
