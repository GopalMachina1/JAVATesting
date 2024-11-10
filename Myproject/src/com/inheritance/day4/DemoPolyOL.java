package com.inheritance.day4;
//this is about method overloading using polymorphism
public class DemoPolyOL {
public DemoPolyOL() {
	System.out.println("I am a default constructor");
}
public DemoPolyOL(int a,int b){
	System.out.println("I am a parameterized constructor "+a+b);
	
}
public void test(int c,int d,String name) {
	System.out.println(c+d);
	System.out.println(name);
	
}
public void test(String name1,double e,double f) {
	System.out.println(name1);
	System.out.println(e+f);
}
public void test(int id,int num,char c) {
	System.out.println(id);
	System.out.println(num);
	System.out.println(c);
}
public static void main(String[] args) {
	DemoPolyOL dol=new DemoPolyOL();
	dol.test(34, 40, "venugopal");
	dol.test(3, 6, 'V');
	dol.test("jyothi", 45.56, 5.45);
	
	
}
}

