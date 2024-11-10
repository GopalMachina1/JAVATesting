package com.javaprogramms.friday;

public class DemoConstructor {
public DemoConstructor() {
	System.out.println("I am a default constructor");
}
public void testconst(int age,String name) {

	System.out.println("my name is :" + name + "and i am in the age of " +age);
}
public static void main(String[] args) {
	DemoConstructor dc=new DemoConstructor();
	dc.testconst(43,"venugopl");
}
}
