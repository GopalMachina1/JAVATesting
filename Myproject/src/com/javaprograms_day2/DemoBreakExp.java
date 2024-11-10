package com.javaprograms_day2;

public class DemoBreakExp {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			if (i == 10) {

				System.out.println(i);
                break;
			}
		}
	}
}
