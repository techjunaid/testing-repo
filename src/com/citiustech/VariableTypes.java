package com.citiustech;

public class VariableTypes {
		
	 //instance variable
	
	int instance_variable = 20;
	
	//static variable
	
	static int static_variable = 30;
	
	public static void main(String[] args) {
		
		// we have to create a object to call the instance variable
		VariableTypes obj = new VariableTypes();
		
		// local variable
		 
		int local_variable = 50;
		
		System.out.println(local_variable);
		System.out.println(static_variable);
		System.out.println(obj.instance_variable);
	}

}
