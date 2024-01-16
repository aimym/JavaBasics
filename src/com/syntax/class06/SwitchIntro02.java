package com.syntax.class06;

public class SwitchIntro02 {
public static void main(String[] args) {
	
	/*
	 *  Switch statement ---> is another conditional statement
	 *  Switch Syntax
	 *  Switch (variable) {
	 *  case value1:
	 *     code A;
	 *      break;
	 *  case value2:
	 *      code B;
	 *      break:
	 *  default:
	 *      code C;
	 *      break;
	 *  } 
	 */
	
	int day=5;
	String dayName;
	
	switch (day) {
	case 1:
		dayName="Monday";
		break;
	case 2:
		dayName="Tuesday";
		break;
	case 3:
		dayName="Wednesday";
		break;
	case 4:
			dayName="Thursday";
			break;
	case 5:
		dayName="Friday";
		break;
	case 6:
		dayName="Saturday";
		break;
	case 7:
		dayName="Sunday";
		break;
		default:
			dayName="Invalid";
			break;
	}
	System.out.println(dayName); //Friday
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
