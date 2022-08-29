package com.aggregation;

public class TestAssociation {

	public static void main(String[] args) {
		Organization org = new Organization();
		Insurance ins = new Insurance();
		
		org.setName("Citiustech");
		ins.setPolicyName("Cover Policy");
		
		System.out.println(org.getName() +" Providing the "+ ins.getPolicyName());

	}

}
//in the association we are not dependent to the insurance company
// if the company shut down we can make a contract with another company
// There is no dependency