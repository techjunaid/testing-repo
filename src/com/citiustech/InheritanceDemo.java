package com.citiustech;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		System.out.println("Father got");
		Father obj = new Father();
		obj.grandFatherMethod();
		obj.fatherMethod();
		
		
		System.out.println("Son got");
		Son obj1 = new Son();
		obj1.grandFatherMethod();
		obj1.fatherMethod();		
		obj1.sonMethod();
		

	}

}
//single level
//super class
class GrandFather{
	public void grandFatherMethod() {
		System.out.println(" farm");
	}
	
}
// sub class
class Father extends GrandFather{
	public void fatherMethod() {
		System.out.println(" car");
	}
	
}
//multilevel
class Son extends Father{
	public void sonMethod() {
		System.out.println(" Cycle");
	}
}

//hierarchical inheritance
//class Uncle extends GrandFather{
//	
//}

// for inheriting use keyword extend
