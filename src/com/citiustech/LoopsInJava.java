package com.citiustech;
import java.util.Scanner;

public class LoopsInJava {

	public static void main(String[] args) {
		// while loop
		
		int n=1, count=5;
		
		while(n<=count) {
			System.out.println("loop is running");
			n++;
		}
		
		// do while loop
		Scanner input = new Scanner(System.in);
		String product;
		int i=0, items;
		
		System.out.println("How many items you want to buy ");
		items = input.nextInt();
		do {
			System.out.println("Enter your item name ");
			product = input.next();
			System.out.println("You have selected "+product);
			i++;
		}while(i<items);
		
		
		// for loop
		
//		for (int j=0; j<10; j++) {
//			System.out.println(j);
//		}

	}

}
