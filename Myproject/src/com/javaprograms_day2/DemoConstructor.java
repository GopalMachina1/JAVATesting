package com.javaprograms_day2;

public class DemoConstructor {
 DemoConstructor(){
	 System.out.println("this is a constructor");
 }
 public void test() {
	 System.out.println("hello good morning");
 }
 public static void main(String[] args) {
	DemoConstructor dc=new DemoConstructor();
	dc.test();
	
}
 }

