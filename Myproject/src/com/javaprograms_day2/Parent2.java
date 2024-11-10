package com.javaprograms_day2;

public class Parent2 {
 public void test(int a, String x) {
	 System.out.println("this is a parent method");
	 System.out.println(a);
	 System.out.println(x);
 }

 public void test2() {
		int i = 1;
		while (i<=10){
			System.out.println(i);
			i++;
		}
 }
public static void main(String[] args) {
	Parent2 pp=new Parent2();
	pp.test(11, "jyothi");
	pp.test2();


}
}
