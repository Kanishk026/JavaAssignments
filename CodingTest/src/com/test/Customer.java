package com.test;

import java.util.List;

public class Customer {
	  private String customerName;
	  private String address;
	  private List<Book> borrowed;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Book> getBorrowed() {
		return borrowed;
	}
	public void setBorrowed(List<Book> borrowed) {
		this.borrowed = borrowed;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", address=" + address + ", borrowed=" + borrowed + "]";
	}
	  
}
