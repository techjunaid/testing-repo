package com.citiustech;

public class ConstructorInInheritance {

	public static void main(String[] args) {
		NewSubClass obj = new NewSubClass();
		
		

	}

}
// How to access the constructor of parent class
class NewSuperClass{
	//constructor
	NewSuperClass(){
		System.out.println("Constructor of parent class");
	}
}
class NewSubClass extends NewSuperClass{
	NewSubClass(){
		super();
		System.out.println("Constructor of child class");
		//super();
		//here give an error because constructor call should be the first call
	}
}