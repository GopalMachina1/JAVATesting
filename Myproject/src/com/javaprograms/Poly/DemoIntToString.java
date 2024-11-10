package com.javaprograms.Poly;

public class DemoIntToString {
		public static void main(String[] args) {
			int i, j, row = 6;
			// Outer loop work for rows
			for (i = 0; i < row; i++) {
				// inner loop for columns
				for (j = 0; j <= i; j++) {
					// prints star
					System.out.print("* ");
				}
				// throws the cursor in a new line after printing each line
				System.out.println();
			}
		}
	}

//This is about triangle