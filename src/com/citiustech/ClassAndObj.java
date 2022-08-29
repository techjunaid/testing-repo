package com.citiustech;

public class ClassAndObj {

	public static void main(String[] args) {

		// first create a object with class name

		Person obj = new Person();
		obj.unique_id = 1001;
		obj.name = "Junaid";
		obj.age = 20;
		obj.city = "Meerut";

		System.out
				.println("Id = " + obj.unique_id + " Name = " + obj.name + " age = " + obj.age + " City = " + obj.city);
//		System.out.println("age = "+obj.age+" City = "+obj.city);

		// second object

		Person obj1 = new Person();
		obj1.unique_id = 1002;
		obj1.name = "Lavkush";
		obj1.age = 20;
		obj1.city = "Mumbai";

		System.out.println(
				"Id = " + obj1.unique_id + " Name = " + obj1.name + " age = " + obj1.age + " City = " + obj1.city);
//		System.out.println("age = "+obj1.age+" City = "+obj1.city);

	}

}

class Person {
	int unique_id;
	String name;
	int age;
	String Gender;
	String city;

}
