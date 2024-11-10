package com.javaprograms.Poly;

public class DemoPoly {
	//polymorphism using method overloading
	public void test(int a, int b, int sum) {
		
	sum=a+b;
		System.out.println("sum of" + a + " and " + b + " is: " + sum);
        
	}

public void test(String course,String course1) {
	System.out.println(course);
	System.out.println(course1);
	
   }
public void test(double c,double d,double diff) {
	diff=c-d;
	System.out.println(diff);
}
public static void main(String[] args) {
	DemoPoly dp=new DemoPoly();

	dp.test(59, 37, 0);
    dp.test("java", "selenium");
    dp.test(90.68,43.75, 0);
}
}

