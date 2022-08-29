package com.aggregation;

public class Customer {
	
    private String name;
    private int id;
    Order order;
    
    
    
	public Customer(String name, int id, Order order) {
		
		this.name = name;
		this.id = id;
		this.order = order;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return id;
	}
	public void setAge(int age) {
		this.id = age;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", order=" + order + "]";
	}
    
    
    

}
