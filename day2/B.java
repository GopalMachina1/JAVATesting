package com.java.day2;


public class B extends A {
	public void test() {
		System.out.println("this is a child method");

	}

	public static void main(String[]args) {
	B bb=new B();
	 bb.test();
	 A aa=new A();
	 aa.test();
	 

}
}