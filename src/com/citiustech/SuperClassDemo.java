package com.citiustech;

public class SuperClassDemo {
	public static void main(String[] args) {
		
//		MySubClass obj = new MySubClass();
//		obj.displayColor();
//		
		MySubClass obj1 = new MySubClass();
		obj1.callMethods();
		
	}

}
// accessing the instance variable of parent class using super keyword

//class MySuperClass{
//	// instance variable
//	String color="Green";
//}
//class MySubClass extends MySuperClass{
//	//instance variable
//	// super keyword
//	String color="Red";
//	
//	public void displayColor() {
//		System.out.println(color);
//		System.out.println(super.color);
//	}
	
	
// to access the method of super class using super
	
class MySuperClass{
	public void display() {
		System.out.println("Method in parent class");
	}
}
class MySubClass extends MySuperClass{
	public void message() {
		System.out.println("In child class");
	}
	public void display() {
		System.out.println("displaying message");
	}
	public void callMethods() {
		message();
		display();
		super.display();
	}
}
	
	
