package com.syntax.class09;

public class HWDouble {
public static void main(String[] args) {
	
   /*
    * Create an array to store double values and then print 
    * those in revers order	
    */
	
	double [] values=new double[]{1.99, 2.99, 3.99, 4.99};
	for(int a=0; a<values.length; a++) {
		System.out.println(values[a]);
	}
	
	System.out.println("-----------Revers way----------------");
	
	double [] value=new double[] {1.99,2.99,3.99,4.99};
	for(int i=value.length-1; i>=0; i--) {
		System.out.println(value[i]+ " ");
	}
     	 
	
	
	
	
	
	
	
	
}
}
