package com.codeo.abstracts;

public class AsusGaming extends Asusabsconstruction{

	public AsusGaming(double price, String productName, int modelno) {
		super(price, productName, modelno);
		this.price =price;
		this.productName=productName;
		this.modelno=modelno;
	}

	@Override
	public void rog() 
	{
		System.out.println("ultra gaming laptop");
		
	}

	@Override
	public void tuf() {
		System.out.println("best army grade gaming laptop  "+price   +productName   +modelno);
		
	}

	@Override
	public void zenbook() {
		System.out.println("best laptop for office");
		
	}

	@Override
	public void price() {
		System.out.println(price+(price*18/100));
		
	}
}
