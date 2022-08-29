package com.citiustech;

public class ConstructorChain {

	public static void main(String[] args) {
		// common way to call constructor
//		ConstructorChain obj1 = new ConstructorChain();
//		ConstructorChain obj2 = new ConstructorChain(9);
		ConstructorChain obj3 = new ConstructorChain(11,10);

	}

	ConstructorChain() {
		System.out.println("This is default constructor");

	}

	ConstructorChain(int a) {
		this();
		System.out.println("number is = "+ a);
		
	}

	ConstructorChain(int a, int b) {
		this(8);
		System.out.println("The sum of numbers = "+(a+b));

	}

}
