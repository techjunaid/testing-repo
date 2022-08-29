package com.citiustech;

public class AbstractDemos {
	public static void main(String[] args) {
		// can not instantiate the abstract class
//		MyAbstractClass obj = new MyAbstractClass();

		MychildAbstractClass obj = new MychildAbstractClass();
		obj.displayinfo(20);
		obj.getInfo();

	}

}

abstract class MyAbstractClass {

	// constructor
	MyAbstractClass() {

	}

	// non abstract method/ normal method
	public void displayinfo(int age) {
		
		System.out.println("Method inside the abstract class");
	}

	// abstract method
	public abstract void getInfo();
}

class MychildAbstractClass extends MyAbstractClass {

	// if there is any abs method you have to override that

	@Override
	public void getInfo() {
		System.out.println("Overriden method");

	}

}