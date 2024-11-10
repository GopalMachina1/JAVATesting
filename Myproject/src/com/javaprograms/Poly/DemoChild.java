package com.javaprograms.Poly;

public class DemoChild extends DemoParent {
	public static void test(String uname, String pwd) {
	System.out.println("I am from child class method" +uname+":"+pwd);

}
	public static void main(String[] args) {
	    test("venu1","venu12");
		test1("venu","venu@3");
	}
	
}
//We cannot override static methods and private methods