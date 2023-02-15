package com.codeo.abstracts;

public class Mathmethod extends Absmath{


	@Override
	public void multi(double a, double b)
	{
		double c;
		c=a*b;
		System.out.println(c);
		
		
	}

	@Override
	public void divide(double a, double b) {
		double c;
		c=a/b;
		System.out.println(c);
		
	}

	@Override
	public void plus(double a, double b) {
		double c;
		c=a+b;
		System.out.println(c);
		
	}

}
