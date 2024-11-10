package com.javaprograms.Poly;

public class DemoOver {

	public DemoOver(){
		System.out.println(" I am a default constructor");
	}

	public void m1(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}

	public void m1(int x, int y, double z) {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}

	public void m1(String k, String l, char m) {
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
	}

	public static void main(String[] args){
		DemoOver dd=new DemoOver();
		dd.m1(45,66);
		dd.m1(2,3,56.89);
		dd.m1("venu","naveen",'g');
	}
}
