package com.niit;

public class CalcTest {
 Integer a,b;

public Integer getA() {
	return a;
}

public void setA(Integer a) {
	this.a = a;
}

public Integer getB() {
	return b;
}

public void setB(Integer b) {
	this.b = b;
}

public CalcTest(Integer a, Integer b) {
	super();
	this.a = a;
	this.b = b;
}

// added new method
public int add(int a,  int b) {
	return a + b;
}
	
}
