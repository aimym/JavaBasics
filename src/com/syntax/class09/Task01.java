package com.syntax.class09;

public class Task01 {
public static void main(String[] args) {
	
	/*
	 * Create an array of Chars and store grades into it: A,B,C,D,E,F
	 * Then print a grade B (use 2 different ways of creating or array)
	 */
	
     char[]grades=new char[6];
     grades[0]='A';
     grades[1]='B';
     grades[2]='C';
     grades[3]='D';
     grades[4]='E';
     grades[5]='F';
     System.out.println(grades[1]);
	
     // Shorter way
     char[] grade= {'A', 'B', 'C', 'D', 'E', 'F'};
     System.out.println(grade[1]);// B
     //How many elements inside array
     
     int size=grade.length; //6
     System.out.println("Numbers of elements is = "+size); // it prints: Numbers of elements is = 6
     
     for(int i=0; i<grade.length; i++) { //here you can't use "i<=grade.length"
    	 System.out.println(grade[1]);
     }
     
     /*
      * Create an array of names and store all names of your group.
      * Then print your name from that array.(use 2 different ways of creating an array).
      */
	
     String[] names=new String[4];
     names[0]="Aidana";
     names[1]="Maksim";
     names[2]="Aimy";
     names[3]="Max";
     System.out.println(names[0]+ " "+ names[1]);
     
     String []name= {"Aidonna", "Macks", "Donna", "Maxim"};
     System.out.println(name[1]+ " "+ name[0]);
     
     /*
      * Create an array of words: Java, Saturday, day, coding,is.
      * Print the following sentence using elements of array: "Saturday is Java coding Day".
      */
	
	 String[] words= {"Java", "Saturday", "day", "coding","is"};
	 System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]); 
	
	
	
	
}
}
