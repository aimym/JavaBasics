package com.syntex.class04;

import java.util.Scanner;

public class MoreExample {

	public static void main(String[] args) {
  
    Scanner in=new Scanner(System.in);
	System.out.println("please enter your full name");
	 //if you need capture more than one word -->use nextLine();
	
	String name=in.nextLine();
	System.out.println(name);//it will execute "Aidana Nurimanova Maratovna"
	
	in.close();
 }
}
