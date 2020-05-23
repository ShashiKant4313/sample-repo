package com.niit;

public class Main {

	public static void main(String[] args) {
		
		// values hardcoded
		int a = 5;
		int b = 10;
		
		// new object made for value accessing
		CalcTest calc = new CalcTest(a, b);
		
		//display output a and b
		System.out.println("value of A : " + calc.getA());
		System.out.println("value of B : " + calc.getB());
		

	}

}
