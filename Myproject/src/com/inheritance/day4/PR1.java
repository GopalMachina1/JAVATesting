package com.inheritance.day4;
//return type methods
public class PR1 {
	public int test(int a, int b) {
		return a + b;

	}

	public String test1(String name, String name1) {
		return (name+name1);
	
		}

	public static void main(String[] args) {
		PR1 pp = new PR1();
		String result1 = pp.test1("venu", "gopal");

		int result = pp.test(20, 25);
		System.out.println(result);
		System.out.println(result1);
	}
}
