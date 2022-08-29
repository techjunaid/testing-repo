package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;



public class CollectionEx {

	public static void main(String[] args) {
		
		Set arr = new HashSet();
		
		arr.add("Junaid");
		arr.add("arraylist");
		arr.add(20);
		
		
		System.out.println(arr);
		
		for (Object obj:arr)
		{
		System.out.println(obj);
		
		}
		
		
	}

}


//ArrayList arr = new ArrayList();
//
//arr.add("Junaid");
//arr.add("arraylist");
//arr.add(20);
//
//
//System.out.println(arr);

//for (Object obj:arr)
//{
//System.out.println(obj);
//
//}
