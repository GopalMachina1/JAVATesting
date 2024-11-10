package com.javaprograms_day2;

public class Parent {
 public void test(int a, String x) {
	 System.out.println("this is a parent method");
	 System.out.println(a);
	 System.out.println(x);
 }

	public static void main(String[] args) {
		C1 dd=new C1();
		dd.toolName();

	dd.test(34,"venugopal");
	}
}

