package com.assignment;

public class Idea {

	private String vendorName;
	Postpaid postpaid;
	
	
	public Idea(String vendorName, Postpaid postpaid) {
		this.vendorName = vendorName;
		this.postpaid = postpaid;
	}


	public String getVendorName() {
		return vendorName;
	}


	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}


	public Postpaid getPostpaid() {
		return postpaid;
	}


	public void setPostpaid(Postpaid postpaid) {
		this.postpaid = postpaid;
	}


	@Override
	public String toString() {
		return "Idea [vendorName=" + vendorName + ", postpaid=" + postpaid + "]";
	}
	
	
	
}
