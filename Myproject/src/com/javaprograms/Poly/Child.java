package com.javaprograms.Poly;

public class Child extends Parent {
	//this is method overriding in polymorphism

	public void test(String name,String name1) {
		System.out.println("This is from Child method");
		System.out.println(name);
		System.out.println(name1);
	}
	public static void main(String[] args) {
		Child cc=new Child();
        cc.test("Jyothi", "VishnuPriya");
		Parent pp=new Child();
		pp.test("venu", "Gopal");
	
	
	}
}
