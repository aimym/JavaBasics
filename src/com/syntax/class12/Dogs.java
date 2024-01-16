package com.syntax.class12;

public class Dogs {

 String name;
 String breed;
 String color;
 int age;
 double weight;
 
 void play () {
	 System.out.println(name+" is playing");
 }
 void jump () {
	 System.out.println(name+" is jumping");
 }	
 void eat () {
	 System.out.println(name+" is eatting");
 }
	void printCompleteInfo() {
		System.out.println("name "+name);
		System.out.println("breed "+breed);
		System.out.println("color "+color);
		System.out.println("age "+age);
		System.out.println("weight "+weight);
	}
	
	public static void main(String[] args) {
	
	Dogs dog1=new Dogs();
	dog1.name="Aktos";
	dog1.breed="Husky";
	dog1.color="White and black";
	dog1.age=2;
	dog1.weight=30;
	dog1.jump();
	dog1.printCompleteInfo();
	
	System.out.println("----------------------");
	
	Dogs dog2=new Dogs();
	dog2.name="Reks";
	dog2.breed="Bulldog";
	dog2.color="Black";
	dog2.age=7;
	dog2.weight=32;
	dog2.eat();
	dog2.printCompleteInfo();
		
		
		
		
		
		
		
}
}
