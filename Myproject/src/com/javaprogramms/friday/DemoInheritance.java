package com.javaprogramms.friday;

public class DemoInheritance {
	public static void main(String[] args) {
		DemoParent dp=new DemoParent();
		dp.test(10,15,0);
		DemoChild dc=new DemoChild();
		dc.test1(59.56,34.34, 0);
		DemoGrandChild dgc=new DemoGrandChild();
	    dgc.test2("selenium", "java");
	}

}
