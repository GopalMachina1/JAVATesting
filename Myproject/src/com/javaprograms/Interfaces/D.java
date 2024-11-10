package com.javaprograms.Interfaces;

public interface D extends A,B,C {
		
	int a=45;
	char c='c';

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(c);
		System.out.println(name);
		System.out.println(course);
		System.out.println(i);
	}
}