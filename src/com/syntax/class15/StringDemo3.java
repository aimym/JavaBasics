package com.syntax.class15;

public class StringDemo3 {
public static void main(String[] args) {
	
	String name="How  @";
	System.out.println(name.lastIndexOf("@"));//4
	name="How are @you guys @";
	System.out.println(name.lastIndexOf("are"));//it shows the number of A
	System.out.println(name.lastIndexOf("@"));//17
	System.out.println(name.indexOf("@"));//8
	
	System.out.println("name.lastIndexOf(\"@\")"+name.lastIndexOf("@"));//name.lastIndexOf("@")18

	System.out.println("name.indexOf(\"@\")"+name.indexOf("@"));//name.indexOf("@")8
	
	//name="How are @you guys @";
	System.out.println(name.indexOf("@",8+1));//18
	

	String name1="How Camelyou Camelguys Camel";
	System.out.println(name1.indexOf("Camel"));// 4
	System.out.println(name1.indexOf("Camel",5));// 13
	System.out.println(name1.indexOf("Camel",14));
	 // 23
	
	
	
	
	
	
	
	
	
	
	
}
}
