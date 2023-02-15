package com.codeo.abstracts;

abstract public class Asusabsconstruction 
{
	double price;
	String productName;
	int modelno;
	
	public Asusabsconstruction(double price, String productName, int modelno) {
		super();
		this.price = price;
		this.productName = productName;
		this.modelno = modelno;
	}
	abstract public void rog();
	abstract public void tuf();
	abstract public void zenbook();
	abstract public void price();
	
	
	
}
