package com.citiustech;

public class InterfaceEx {
	public static void main(String[] args) {
		MyImplClass obj = new MyImplClass();
		obj.getInfo();
		obj.getData();
		obj.display1();
		MyInterface.display();
	}

}

// we have to achieve abstraction using interface
interface MyInterface{
	// 100% abstract by interface
	public abstract void getInfo();
	public abstract void getData();
	
	//this is story before version 1.7
	//from java 1.8 we are able to implement default and static methods
	
	static void display() {
		System.out.println("This is display method in My Interface");
		
	}
	default void display1() {
		System.out.println("This is display1 method in My Interface");
	}
}
class MyImplClass implements MyInterface{

	@Override
	public void getInfo() {
		System.out.println("getInfo method implementation");
		
	}

	@Override
	public void getData() {
		System.out.println("getData method implementation");
		
	}
	
}

