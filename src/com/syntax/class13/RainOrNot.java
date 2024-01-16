package com.syntax.class13;

public class RainOrNot {

//void is type of method
	void aidana(boolean isRaining) {
		if(isRaining) {
			System.out.println("I'm staying home");
		}else {
			System.out.println("Let's go for a walk");
		}
	}
	
	void checkPerson (String name) {
		if("Aidana".equals(name)) {
			System.out.println("Nurimanova");
		}else if("Maksim".equals(name)) {
			System.out.println("Kravchenko");
		}else {
			System.out.println("Unknown");
		}
	}
	
	public static void main(String[] args) {
	
		RainOrNot obj=new RainOrNot();
		obj.aidana(true);
		obj.checkPerson("Aidana");
		obj.checkPerson("Maksim");
}
}
