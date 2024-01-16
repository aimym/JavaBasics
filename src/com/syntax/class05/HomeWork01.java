package com.syntax.class05;

import java.util.Scanner;

public class HomeWork01 {
public static void main(String[] args) {
	
	Scanner timeIn=new Scanner(System.in);
	System.out.println("Enter the current hour (24 format):");
	int time=timeIn.nextInt();
	
	if(time>0 && time<=11) {
		System.out.println("Moring");
	}else if(time>11 && time<=15) {
		System.out.println("Afternoon");
	}else if(time>15 && time<=20) {
		System.out.println("Evening");
	}else if (time>20 && time<=24) {
		System.out.println("Night");
	}else {
		System.out.println("Wrong format. Enter 1-24");
	}
	
	timeIn.close();
	
	
	
	
	
	
	
	
	
	
	
	
}
}
