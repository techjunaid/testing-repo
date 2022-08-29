package com.aggregation;

public class TestAggregation {

	public static void main(String[] args) {
		Order ord = new Order();
		
		ord.setPrice(1001);
		ord.setQuantity(3);
		
		Customer obj = new Customer("Junaid",1008,ord);
		System.out.println(obj);
		
		
		Customer obj1 = new Customer("Virat",1009, new Order(1000,2));
		System.out.println(obj1);
		
	}

}
