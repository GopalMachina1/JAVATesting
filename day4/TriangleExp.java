package com.java.day4;

public class TriangleExp{
	public void test() {
	int i , j ,row=6;   
	for(i=0; i<row; i++)   
	{   
	
	for(j=0; j<=i; j++)   
	{   
	
	System.out.print("* ");   
	}   
	System.out.println();   
	}   
	}   
public static void main(String []args) {
 TriangleExp de=new TriangleExp();
 de.test();
}
}