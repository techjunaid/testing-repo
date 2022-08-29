package com.citiustech;

public class AnnonymousArray {

	public static void sum(int arr[]) {
		for (int i=0;i<5;i++) {
			System.out.println(arr[i]);
			
		}
	}
	   
	public static void main(String[] args) {
		
		sum (new int[] {1,2,3,4,5});

	}

}
