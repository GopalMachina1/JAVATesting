package com.java.day5;
//this program is about constructor
public class DemoConstructor {
	DemoConstructor(){
		System.out.println("good morning hyderabad");
	}
	public  static void test() {
		System.out.println("This is a void method");
	}

	public static void main(String[] args) {
		DemoConstructor dc=new DemoConstructor();
		dc.test();
	}
}
