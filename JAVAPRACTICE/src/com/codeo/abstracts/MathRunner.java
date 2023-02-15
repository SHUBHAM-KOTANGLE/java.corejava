package com.codeo.abstracts;

import java.util.Scanner;

public class MathRunner {

	public static void main(String[] args) {
		
		Scanner scs=new Scanner(System.in);
		Absmath math=new Mathmethod() ;
		System.out.println("give first number");
		double a =scs.nextInt();
		System.out.println("give second number");
	    double b=scs.nextInt();
		math.plus(a, b);
		math.multi(a, b);
		math.divide(a, b);
		
		
		
		
			
		
	}

}
