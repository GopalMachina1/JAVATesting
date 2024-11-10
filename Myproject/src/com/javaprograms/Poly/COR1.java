package com.javaprograms.Poly;
//method overriding in polymorphysm
public class COR1 extends POR1 {
	public void test(String name, int age) {
		System.out.println("I am from Child class");
		System.out.println("my name is:" + name);
		System.out.println("my age is :" + age);
	}

public static void main(String[] args) {
	COR1 cr=new COR1();
	cr.test("venu", 43);
	POR1 pr=new POR1();
	pr.test("jyothi", 30);
	POR1 pp= new COR1();
	pp.test("jyothi", 30);
}
}

