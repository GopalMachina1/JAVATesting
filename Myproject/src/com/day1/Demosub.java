package com.day1;

public class Demosub {

	public void test(int a,int b,int c) {
		c=a-b;
		System.out.println("difference is:" +c);
	}
public static void main(String[] args) {
	Demosub ds=new Demosub();
	ds.test(40, 24, 0);
}
}
