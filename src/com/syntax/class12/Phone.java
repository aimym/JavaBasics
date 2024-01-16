package com.syntax.class12;

public class Phone {

  String make;
  String model;
  int noOfCame;
  String color;
  double screenSize;
  String os;
  
  void  makeCall(){
	  System.out.println("Making a call");
  }
	void takePicture () {
		System.out.println("Taking picture");
	}
	
	void printCompleteInfo() {
		System.out.println("makes "+make);
		System.out.println("model "+model);
		System.out.println("noOgCame "+noOfCame);
		System.out.println("Color "+color);
		System.out.println("screenSize "+screenSize);
		System.out.println("os "+os);
	}
	
	public static void main(String[] args) {
	
	Phone iphone=new Phone();
	iphone.make="Apple";
	iphone.model="Iphone 13";
	iphone.noOfCame=3;
	iphone.color="blue";
	iphone.screenSize=6.8;
	iphone.os="IOS";
	iphone.makeCall();
	iphone.takePicture();
	iphone.printCompleteInfo();
	
	System.out.println("--------------------------");
	Phone pixel=new Phone();
	pixel.make="pixel";
	pixel.model="pixel 6";
	pixel.noOfCame=2;
	pixel.color="blue";
	pixel.screenSize=6.8;
	pixel.os="ANdroid";
	pixel.makeCall();
	pixel.takePicture();
	pixel.printCompleteInfo();
	
	
	
	
	
	
	
	
	
	
	
}
}
