package com.exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
		int number1 = 50, number2 = 0;
		System.out.println(number1/number2);
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println("You can not divide a number by zero");
		}finally {
			System.out.println("Thanks for using our application");
		}
		
		
	}

}

//unchecked exception because not showing any error
		//int a = 50/0; //arithmeticException
//		String st_name = null;
//		System.out.println(st_name.length());//null pointer exception
//		try{
//			int a=80, b=0;
//			System.out.println(a/b);
//		}catch(Exception e) {
//			System.out.println("You cant divide any number by zero ");
//		}
//		
//		System.out.println("Code must be run ");