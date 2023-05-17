package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

// Spring Interface 
public class Pepsi implements InitializingBean,DisposableBean{

	private double price;

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pepsi(double price) {
		super();
		this.price = price;
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("Taking pepsi");
//		
//	}

//	@Override
//	public void destroy() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("Going to put bottle back to shop: destory");
//	}
	
	
	
	
}
