package com.citiustech;

public class Polymorphism {

	public static void main(String[] args) {
		Child obj = new Child();
		
		obj.myMethod();
		obj.myMethod1();

	}

}

class PolymorphismDemo {
	// static polymorphism- Method overloading

	public void myMethod() {

	}

	public void myMethod(int age) {

	}
//	public int myMethod(int age) {
//		return age;
//
//	}

	public void myMethod(String age) {

	}

	public void myMethod(int age, String name) {
     
	}

	public void myMethod(String name, int age) {

	}

}


//method overriding nothing but allows a subclass or child class to provide 
//a specific implementation that already parent have

class Parent{
	public void myMethod() {
		System.out.println("This is method in parent");
		
	}
	public void myMethod1() {
		System.out.println("This is method1 in parent");
		
	}
	
}
class Child extends Parent {
	@Override
	public void myMethod() {
	
		System.out.println("This is method in child");
		
	}
	@Override
	public void myMethod1() {
		System.out.println("This is method1 in child");
		
	}
}