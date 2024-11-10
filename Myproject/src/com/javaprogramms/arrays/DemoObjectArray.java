package com.javaprogramms.arrays;

import java.util.Arrays;

public class DemoObjectArray {
	Object[] s = new Object[15];
	public void test1() {
		System.out.println("length of an object array is:" +s.length);
		s[0] = 33;
		s[1] = "venu";
		s[2] = 45.60;
		s[3] = "v";
		s[4] = "sasi";
		s[5] = true;
		System.out.println(Arrays.toString(s));
	}
	public static void main(String[] args) {
		DemoObjectArray da = new DemoObjectArray();
		da.test1();
	}
}
