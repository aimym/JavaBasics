package com.syntax.class07;

public class WhileLoopIntro {
public static void main(String[] args) {
	
	int time=10;
	if (time<12) {
		System.out.println("Morning");
	}
	
	System.out.println("---------------------------------------------");
	
	int a=10;
	while (a<12) {
		System.out.println("Morning");
	    a++;
	} //it executes "Morning" two times and exits the block
	
	System.out.println("-----------------------------------------");
	
	int b=7;
	while (b<12) {
		System.out.println("Morning");
		b++;
	} //this time it executes "Morning" 5 times
	
	// WHEN CONDITION IS FALSE YOU CANNOT EXECUTE ANYTHING
	
	// EXAMPLE 
	
	int c=7;
	while (c>12) {
		c++;
		System.out.println("Morning");
	}
	System.out.println("END OF THE CODE");// it prints only "END OF THE CODE"
	
	// int time5=17;
	//while (time5>12) {
	//System.out.println("Morning");
	//time5++;
	//}
	//System.out.println("End of the code"); in this case it prints forever
	
	
	int d=17;
	while (d>12) {
		System.out.println("Morning");
		d--;
	} // it'll print "Morning" 5 times
	
	
	
	
	
	
}
}
