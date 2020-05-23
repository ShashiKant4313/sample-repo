package com.niit;

public class Main {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		
		// new object made for value accessing
		CalcTest calc = new CalcTest(a, b);
		
		System.out.println("Get value of A : " + calc.getA());
		System.out.println("Get value of B : " + calc.getB());
		

	}

}
