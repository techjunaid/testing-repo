package com.citiustech;

public class ArrayInJava {
	
	public static void main(String[] args) {
		// array
		// index starts from 0
		
		int [] employee_id = new int[5];
		employee_id[0]=100;
		employee_id[1]=101;
		employee_id[2]=102;
		employee_id[3]=103;
		employee_id[4]=104;
		
		System.out.println(employee_id[2]);
		System.out.println(" ");
		
		for (int i=0;i<5;i++) {
			System.out.println(employee_id[i]);
			
		}
		
		// 2D array
		
		String [][] information = {{"Mr","Miss"},{"Virat","Anushka"}};
		System.out.println(information[0][0]+information[1][0]);
		System.out.println(information[0][1]+information[1][1]);
		
		
	}

}
