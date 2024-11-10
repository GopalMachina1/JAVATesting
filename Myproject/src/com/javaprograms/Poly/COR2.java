package com.javaprograms.Poly;
//about constructor overloading
public class COR2 extends POR2{
	
public void test(String name,int duration) {
	System.out.println(name);
	System.out.println(duration);
}

 public static void main(String [] args) {
	 COR2 cr=new COR2();
	 cr.test("automation", 30);
	 cr.test("selenium", 30);
 } 
 }

