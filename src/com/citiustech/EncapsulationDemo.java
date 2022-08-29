package com.citiustech;

import com.model.Employee;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// how can i set the values and get the values
				Employee obj = new Employee();
				
				obj.setEmp_id(101);
				obj.setEmp_name("Junaid");
//				System.out.println("Id = "+obj.getEmp_id()+" Name = " +obj.getEmp_name());
				
				System.out.println(obj);
				

	}

}
