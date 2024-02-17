package com.java.day1;

public class DemoMultiDimArrays {

	public static void main(String[] args) {

		String[][] emp = new String[3][3];

		emp[0][0] = "Vishnu";
		emp[0][1] = "Archana";
		emp[0][2] = "Sandya";

		emp[1][0] = "Vinod";
		emp[1][1] = "Asif";
		emp[1][2] = "Kavya";

		for (int i = 0; i < 2; i++) {
			System.out.println("+++++");
			for (int j = 0; j < 3; j++) {
				System.out.println(emp[i][j]);
			}
			System.out.println("----");
		}

		int[][] ar2 = { { 2, 4 }, { 3, 5 }, { 5, 6 } };

		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(ar2[i][j]);
		}

	}
}
}