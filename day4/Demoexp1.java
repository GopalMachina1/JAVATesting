package com.java.day4;

public class Demoexp1 {
	int i = 50;
	int j = 40;
	public void test() {
		int sum=i+j;
  System.out.println("sum of two numbers:" + sum);
	}
     public void test1() {
 int sub=i-j;
	System.out.println("subtraction of two numbers is:"+sub);
    }
 public static void main(String[] args) {
	 Demoexp1 dp= new Demoexp1();
		dp.test();
		dp.test1();
	}
}
