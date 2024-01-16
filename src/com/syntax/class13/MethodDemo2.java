package com.syntax.class13;

public class MethodDemo2 {

 /*
  * Create a method that takes an animal name and person name. If person name is equal to 
  * Teyfur and animal name is Horse then print camel 
  * oterwise print horse	
  */
	
	void TeyfurAndHorse (String personName,String animalName) {
		if("Teyfur".equalsIgnoreCase(personName) && "Horse".equalsIgnoreCase(animalName)) {
			System.out.println("This is a Camel");
		}else {
			System.out.println("This is a horse");
		}
	}
	public static void main(String[] args) {
	
	MethodDemo2 obj=new MethodDemo2();
	obj.TeyfurAndHorse("Teyfur", "horse");// this is a Camel
	obj.TeyfurAndHorse("Horse", "Memer");//this is a horse
		
}
}
