package com.syntax.class14;

public class Task04 {

	/*
	 * Create a method createEmail(). Based on values of user name, lastName and emailtype,
	 * your method should return complete email Address.
	 * Example: createEmail(Jhon,snow,gmail)
	 * Jhonsnow@gmail.com
	 *
	 */
	
	String createEmail(String name, String lastName, String emailType) {
		return name+lastName+"@"+emailType+".com";
	}
	
	public static void main(String[] args) {
		
		Task04 obj=new Task04();
		System.out.println(obj.createEmail("Aidana","Nurimanova","gmail"));
		
		
	}
}
