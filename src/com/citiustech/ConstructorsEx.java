package com.citiustech;

public class ConstructorsEx {

	public static void main(String[] args) {

		// if we don't have a default constructor then it will give an error
		Car obj = new Car();
		// parameterized constructor
		Car obj1 = new Car("Tata");

		obj.DisplayInfo();
		int price = obj.getCarPrice(1000);
		System.out.println("Price of car = " + price);
	}

}

class Car {
//	 constructor
//	 a constructor doesn't have a return type
//	 default constructor
	Car() {

		System.out.println("This is a constructor");

	}

	// parameterized constructor

	Car(String car_name) {
		System.out.println("Name of car = " + car_name);
	}

	// method
	// should have the return type

	void DisplayInfo() {

		System.out.println("This is a method to display information");

	}

	// method with return type
	public int getCarPrice(int car_Price) {

		return car_Price;

	}

}
