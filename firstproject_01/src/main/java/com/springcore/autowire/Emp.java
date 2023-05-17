package com.springcore.autowire;

public class Emp {

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("inside get addresses method");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor method");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
