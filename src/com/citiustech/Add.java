package com.citiustech;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		int a = input.nextInt();
		
		System.out.println("Enter the value of b : ");
		int b = input.nextInt();
		
		int c = a+b;
		
		System.out.println("the sum of a and b is = "+ c);

	}

}
class MyClass{
	
}