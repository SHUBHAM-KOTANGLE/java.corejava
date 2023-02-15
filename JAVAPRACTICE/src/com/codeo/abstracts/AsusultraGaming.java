package com.codeo.abstracts;

public class AsusultraGaming extends Asusabsconstruction{
    double price;
	public AsusultraGaming(double price, String productName, int modelno) {
		super(price, productName, modelno);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void rog() 
	{
		System.out.println("ultra gaming laptop");
		
	}

	@Override
	public void tuf() {
		System.out.println("best army grade gaming laptop");
		
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
