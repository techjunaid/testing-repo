package com.citiustech;

public class ConditionalStatementsDemo {

	public static void main(String[] args) {

		// if else statements

		int userid = 1001;
		int phone = 12345;

		if (userid == 1001) {
			System.out.println("Valid User");
		} else {
			System.out.println("Invalid User");
		}

		// else if statement

		if (userid == 10001) {
			System.out.println("Valid User");
		} else if (phone == 12345) {
			System.out.println("Phone number is valid");
		} else {
			System.out.println("invalid user");

		}
		// switch case statement
		char ch = 'J';

		switch (ch) {
		case 'J':
			System.out.println("J is correct choice for JBL");
			break;

		case 'K':
			System.out.println("K is not a corect choice for Kite");
			break;

		default:
			System.out.println("Please select a right character");

		}

	}

}
