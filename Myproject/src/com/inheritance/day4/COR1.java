package com.inheritance.day4;

public class COR1 extends POR1 {
//	public void test(int a, int b) {
//		System.out.println("I am from Child class");
//		System.out.println(a + b);
//	}

	public static void main(String[] args) {
		COR1 cr = new COR1();
		cr.test(10, 25);
		POR1 cr1=new COR1();
		cr1.test(20,30);
	}
}
