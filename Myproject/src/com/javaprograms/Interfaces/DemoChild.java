package com.javaprograms.Interfaces;

public class DemoChild implements Parent1, Child1{
	public void test() {
		System.out.println("This is from Child1 interface");
		int a=30;
		int b=25;
		int c=a+b;
		System.out.println("sum of a and b is:"+c);
	}
	
	public void test1() {
		System.out.println("this is from Parent1 interface");
		double a=100.35;
		double b=150.65;
		double c=b-a;
		System.out.println("difference of " +b+ "and" +a+"is:"+c );
	}
}
