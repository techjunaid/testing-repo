package com.citiustech;

public class StringEx {

	public static void main(String[] args) {
		// String is char array
		// can initiated in " "
		// strings are object
		// immutable
		// string uses new
		
		String name = "Junaid";
		String name1 = "Junaid";
		String name2 = new String ("Junaid");
		
		if (name==name1) {
			System.out.println("Matched");
		}else {
			System.out.println("Not matched");
		}
		
		System.out.println(name.compareTo(name2));
		
		StringBuffer obj = new StringBuffer("Junaid ");
		obj.append("khan");
		
		System.out.println(obj);

	}

}
