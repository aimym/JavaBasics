package com.syntax.class07;

public class WhileLoopDemo {
public static void main(String[] args) {
	
	int a=1;
	
	while (a<=5) {
		System.out.println(a);
		a++;
	}
	System.out.println("The end");
	/*
	 * it'll print:1
	 *             2
	 *             3
	 *             4
	 *             5
	 *           The end
	 */
	
	// ++ <---increment  -- <--- decrement 
	
	int b=1;
	while(b<=5) {
		System.out.println(b);
		b++;
	}
	System.out.println("The value of b outside of while loop= " +b);
	System.out.println("THE END");
	
	// I need to print values from 2 to 20
	
	int c=2;
	while (c<=20) {
		System.out.print(c);
		c++;
	}
	System.out.println("THE END");
	/*
	 * 1
	 * 2
	 * 3
	 * 20
	 * THE END
	 */
	
	System.out.println("--------I NEED NUMBER FROM20 TO 1---------------");
	
	int d=20;
	while (d>=1) {
		System.out.println(d + " ");
		d--;
	}
	System.out.println("THE END");// 20 19 18 17 16 15 -- 1 
	                              // THE END
	
	int f=20;
	while (f>=1) {
		System.out.println(f + " ");
		f++;
	} //it'll print forever
	
	int h=20;
	while (h<=1) { // <--- false
		System.out.println(h + " ");
		h--;
	} // You can't print anything
	
	
	
	
	
	
	
}
}
