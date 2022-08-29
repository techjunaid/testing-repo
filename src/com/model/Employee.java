package com.model;

public class Employee {
	private int emp_id;
	private String emp_name;
	
	// to get the emp_id
	public int getEmp_id() {
		return emp_id;
	}
	// to set the emp_id
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	//to get the emp_name
	public String getEmp_name() {
		return emp_name;
	}
	// to set the emp_name
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + "]";
	}

}



//Requirements- i want to create a separate class 
//set data members private
//i will have to set values for these data members and get the values of data members
//Encapsulation
//it is wrapping up our data members
//fully encapsulated class
//java bean class
//POJO--> Plain old java object
