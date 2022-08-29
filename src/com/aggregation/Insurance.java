package com.aggregation;

public class Insurance {
	private String PolicyName;

	public String getPolicyName() {
		return PolicyName;
	}

	public void setPolicyName(String policyName) {
		PolicyName = policyName;
	}

	@Override
	public String toString() {
		return "Insurance [PolicyName=" + PolicyName + "]";
	}
	
	
	
	
}
