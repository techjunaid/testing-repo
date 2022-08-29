package com.citiustech;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// taking user input by Scanner class
		// we have import scanner package for this
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name");
		String student_name = input.next();
		System.out.println("your name = "+ student_name);

		
		System.out.println("Enter your age");
		int student_age = input.nextInt();
		System.out.println("your age = "+ student_age);

	}

}
