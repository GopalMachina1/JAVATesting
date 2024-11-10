package com.interfaces.day5;

public class DemoInheritance {
	public static void main(String[] args) {
		C1 cc = new C1();
		System.out.println(cc.course1);
		cc.testchild();
		//System.out.println(cc.course);
		//cc.testParent();
		//System.out.println(cc.a);
		//cc.testgrandparent();
		 //I am from interface D1
		System.out.println(cc.name);
		cc.test1();
		//this is from grand child class
		//GC1 gc = new GC1();
		//System.out.println(gc.collegename);
		//gc.testgrandchild();
		//i am from c2 class
		C2 c=new C2();
		c.test1();
	}

}
