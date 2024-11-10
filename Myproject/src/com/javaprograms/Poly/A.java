package com.javaprograms.Poly;

public class A {
		
		String name = "Selenium-java";
		
		int age = 30;
		
		static double tax = 10;
		
		public void t1() {
			System.out.println("I am pursuing " + name + " course.");
			
			int sal = 3000;	
		}
		
		public void t2() {
			System.out.println("I trained " + name + " course.");	
		}
		public void t3() {
			System.out.println("I am giving training" + name + " course.");
			
		}
		
		public void t4() {
			System.out.println("I am looking " + name + " job.");
			
		}
public static void main(String[] args) {
	 A aa=new A();
	 aa.t1();
     aa.t2();
     aa.t3();
     aa.t4();
}

}


