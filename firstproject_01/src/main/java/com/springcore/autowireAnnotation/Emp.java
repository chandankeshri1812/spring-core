package com.springcore.autowireAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {

	
	private Address address;

	public Address getAddress() {
		return address;
	}

	
	public void setAddress(Address address) {
		System.out.println("inside setter addresses method");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	@Autowired
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
