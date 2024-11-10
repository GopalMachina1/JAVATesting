package com.java.day3;

public class ConversionofStringtoInt {
//about wrapper class
public static void main(String[] args) {
	String sal="20000";
	int sal2=20000;
	int sal3=Integer.parseInt(sal);
	if(sal3==sal2) {
		System.out.println("success");
	}
		else
		{
			System.out.println("failed");
	}
}
}
