package com.java.day4;

public class Demoexp2{
	public static void main(String[] args) {
	
	int i, j, row=6;
	for(i=0;i<row;i++)
	{
    for (j = 0; j <= i; j++) {
			System.out.print("* ");
    }
		// throws the cursor in a new line after printing each line
		System.out.println();
	}
}
}
