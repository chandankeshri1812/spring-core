package com.springcore.lifecycle;


// xml
public class Sasmosa {

	private double price;

	
	
	

	public Sasmosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Sasmosa [price=" + price + "]";
	}

	public Sasmosa(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting property ");
		this.price = price;
	}
	
	
	public void init() {
		System.out.println("inside init method ");
	}
	public void destory() {
		System.out.println("inside destory method");
	}
	
	
}
