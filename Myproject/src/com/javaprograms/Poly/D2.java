package com.javaprograms.Poly;

public class D2 {
		
		int sal;
		public static void test3() {
			System.out.println("Hello i am test3");
		}
		 int course = 123; // non static vars
		 static String language = "java"; // static vars

		public void test1() { // non static method
			String city = "hyderabad"; //local vars	
			System.out.println("I am test1");
			System.out.println(city);
		}
		public void test2() {
			System.out.println("hello i am test2");
			System.out.println(course);
		}
		public static void main(String[] args) {
			D2 dd=new D2();
		dd.test1();
		dd.test2();
		test3();
		}
}
		