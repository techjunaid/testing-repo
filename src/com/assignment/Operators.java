package com.assignment;

public class Operators {

	public static void main(String[] args) {
		Prepaid pre = new Prepaid();
		pre.setPlans(499);
		
		Postpaid post = new Postpaid();
		post.setPlan(699);
		
		Jio obj = new Jio("Vendor Bharti",pre);
		System.out.println(obj);
		
		Idea obj1 = new Idea("Vendor Kliy",post);
		System.out.println(obj1);

	}

}
