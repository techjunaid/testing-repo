package com.assignment;

public class Jio {
	
	private String vendorName;
	Prepaid prepaid;
	
	public Jio(String vendorName, Prepaid prepaid) {
		this.vendorName = vendorName;
		this.prepaid = prepaid;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public Prepaid getPrepaid() {
		return prepaid;
	}

	public void setPrepaid(Prepaid prepaid) {
		this.prepaid = prepaid;
	}

	@Override
	public String toString() {
		return "Jio [vendorName=" + vendorName + ", prepaid=" + prepaid + "]";
	}

	
	
}
