package com.syntax.class07;

public class Task {
public static void main(String[] args) {
	
	int num=2;
	
	while(num<=6) {
		System.out.print(num + " ");
		num+=2;
	}
	 
	  
	System.out.println("The End"); // 2 4 6 The End
	
	//ANOTHER WAY TO PRINT EVEN NUMBERS FROM 1 TO 30
	System.out.println("-----------------------------------");
	
	int e=1;
	while (e<=30) { 
    if(e%2==0) {
    	System.out.println(e);
    }
     e++;
  }
	
	
	
	
	
}
}
