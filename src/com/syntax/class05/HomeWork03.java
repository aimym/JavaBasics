package com.syntax.class05;

import java.util.Scanner;

public class HomeWork03 {
public static void main(String[] args) {
	
	Scanner inp=new Scanner(System.in);
	System.out.println("What's your height, boy?");
	int hei=inp.nextInt();
	
	if(hei<60) {
		System.out.println("Oops, you are shortie, lad");
	}else if(hei>=60 && hei<=70) {
		System.out.println("You are aaaa'it");
	}else {
		System.out.println("Too tall to exist");
	}
	
	inp.close();
	
	
	
	
	
	
	
	
	
	
	
	
}
}
