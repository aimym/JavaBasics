package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
    /* If you forgot to click the "public static void main(String[]args)"
      * when you created a class. What you can do is 
     * type "main' then press "ctr" then hit "space" same way for mac or window
     */
		int i=10;
		//Casting: we can cast primitive and non primitive 
		//widening or implicit
		//we store int value 10 inside double variable 
		double d=10;
		System.out.println(i);//10
	    System.out.println(d);//10.0
	
	    //int num=10.0;//Type mismatchz: connot convert from double to int
	     
	    //norrowing or explicit casting
	    //we store double value 10.99 into int variable
	    int num=(int)10.99;//10
	    System.out.println(num);
	    
	    //float f=10.99;// Type mismatch:connot convert from double to float
	    //float f=10.99f;
	    
	    byte b=(byte)1000;
	    System.out.println(b);//-24
	}

}
