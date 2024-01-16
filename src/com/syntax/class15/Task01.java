package com.syntax.class15;

public class Task01 {
public static void main(String[] args) {
	
	String userName="Asel";
	String password="pass123";
	String confirmPassword="pass123";
	if(userName.isEmpty() || password.isEmpty()) {
		System.out.println("UserName and password can't be empty");
	}else {
		if(password.length()<8) {
			System.out.println("Password is too short");
		}else {
			if(password.contains(userName)) {
				System.out.println("Password can't contain UserName");
			}else {
				if(password.equals(confirmPassword)) {
					System.out.println("Your userName and password has been created");
				}else {
					System.out.println("Password do not match");
				}
			}
		}
	}
	//password is too short
	
	
	
	
	
	
	
	
	
}
}
