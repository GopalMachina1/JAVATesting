package com.javaprogramms.friday;

public class DemoChild  extends DemoParent{
	public void test1(double c,double d,double diff) {
		System.out.println("I am from child class");
		
		 diff=c-d;
		 System.out.println("the difference of"+ c + "and" + d +"is:"+diff);
	}

}
