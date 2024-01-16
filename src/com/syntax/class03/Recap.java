package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
		String dayTime = "morning";
		int date = 22;
		String month = "January";
		// Today is morning of January 22
		// + used to attach String to anything
		String sentence = "Today is " + dayTime + " of " + month + date;
		System.out.println(sentence); // Today is moring of January 22
		int year = 2022;
		String year1 = "2022";
		System.out.println(year + 10); // 2032
		System.out.println(year1 + 10); // 202210

		// +,-,*,/,%
		int num = 100;
		num = num + 100;
		System.out.println(num); // 200
		num += 100; // This exact means -->this--.num=num+100
		System.out.println(num); // 300
		num -= 20;
		System.out.println(num); // 280
		num /= 10; // shorter way of num=num/10
		System.out.println(num); // 28
        num%=2;
        System.out.println(num); //0
	}

}
