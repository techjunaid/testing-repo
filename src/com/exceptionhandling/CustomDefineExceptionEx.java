package com.exceptionhandling;

class InvalidAge extends RuntimeException{
	
	String age;

	public InvalidAge(String string) {
	
		this.age = string;
	}
	
}

public class CustomDefineExceptionEx {
	
	public static int validateAge(int age) throws InvalidAge {
		if(age<18) {
			throw new InvalidAge("You are not eligible for vote");
		}
		else {
			return age;
		}
	}
	


	public static void main(String[] args) {
	validateAge(2);

	}

}
