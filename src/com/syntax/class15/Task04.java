package com.syntax.class15;

public class Task04 {
public static void main(String[] args) {
	
	String str="Sunday";
	String rev="";
	for(int i=str.length()-1; i>=0; i--) {
		rev=rev+str.charAt(i);
	}
    System.out.println(rev);
}

}
