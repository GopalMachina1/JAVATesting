package com.javaprograms.Poly;
public class B {
//this is about Switch case
	public void switchDemo() {

		int result = 70;

		switch (result) {
		case 10:
			System.out.println("Fail");
			break;

		case 60:
			System.out.println("A1");
			break;

		case 70:
			System.out.println("X1");
			break;
		case 50:
			System.out.println("A2");
			break;
		default:
			System.out.println("not found");
			break;
		}

	}

	public static void main(String[] args) {
		B bb = new B();
		bb.switchDemo();
	}
}



